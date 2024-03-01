grammar Pmm;
@header{
    import ast.expression.*;
    import ast.node.*;
    import ast.type.*;
    import ast.type.struct.*;

}

program returns [ASTNode ast]: definition* main EOF
       ;

expression returns [Expression ast]:  INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
            | REAL_CONSTANT
              {$ast = new FloatLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
            | CHAR_CONSTANT
              {$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
            | ID
              {$ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
            | functioninvocation
              {$ast = $functioninvocation.ast;}
            | '(' e=expression ')'
                {$ast = $e.ast;}
            | e1=expression pos='[' e2=expression ']'
              {$ast = new ArrayAccess($pos.getLine(),$pos.getCharPositionInLine()+1,$e1.ast,$e2.ast);}/**ARRAY ACCESS**/
            | e=expression '.' ID /*Struct access*/
              {$ast = new StructAccess($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text,$e.ast);}
            | pos='(' t=type ')' exp=expression
              {$ast=new Cast($pos.getLine(),$pos.getCharPositionInLine()+1,$type.ast, $exp.ast);}
            | minus='-' exp=expression
              {$ast = new UnaryMinus($minus.getLine(),$minus.getCharPositionInLine()+1, $exp.ast);}
            | negation='!' exp=expression
              {$ast = new Negation($negation.getLine(),$negation.getCharPositionInLine()+1, $exp.ast);}
            | exp1=expression operator=('*'|'/'|'%') exp2=expression
              {$ast = new Arithmetic($operator.getLine(),$operator.getCharPositionInLine()+1,$exp1.ast,$exp2.ast,$operator.text);}
            | exp1=expression operator=('+'|'-') exp2=expression
              {$ast = new Arithmetic($operator.getLine(),$operator.getCharPositionInLine()+1,$exp1.ast,$exp2.ast,$operator.text);}
            | exp1=expression operator=('>'|'>='|'<'|'<='|'!='|'==') exp2=expression
              {$ast = new ArithmeticComparison($operator.getLine(),$operator.getCharPositionInLine()+1,$exp1.ast,$exp2.ast,$operator.text);}
            | exp1=expression operator=('&&'|'||') exp2=expression
              {$ast = new Logical($operator.getLine(),$operator.getCharPositionInLine()+1,$exp1.ast,$exp2.ast,$operator.text);}
            ;


main: 'def' 'main' '(' ')'':''{' varDefinition*  statementList '}'

            ;

statement: 'return' expression ';'
          | 'print' expressionList ';'
          | 'input' expressionList ';'
          | expression '=' expression ';'
          | 'while' expression ':' '{' statementList '}'
          | 'if' expression ':' statementList ('else' ':' statementList)?
          | functioninvocation ';'
          ;

definition: varDefinition
            | funcDefinition;


statementList: statement*;

expressionList returns [List<Expression> ast = new ArrayList<Expression>()]: (e1=expression {$ast.add($e1.ast);} (',' e2=expression {$ast.add($e2.ast);} /**.ast da instancia de clases mias*/ )* )?;

functioninvocation returns [FunctionInvocation ast]:
            /**function variable*/ ID '(' exps=expressionList ')'
            {$ast = new FunctionInvocation($ID.getLine(),$ID.getCharPositionInLine() + 1,$exps.ast,new Variable($ID.getLine(),$ID.getCharPositionInLine(),$ID.text));};



funcDefinition: 'def' ID'(' parametersList ')' ':' basicType '{' varDefinition* statementList '}' ;

parametersList: (parameter (',' parameter)* )?;

type returns [Type ast]:
        basicType
        {$ast=$basicType.ast;}
      | bracket='[' INT_CONSTANT ']' type
        {$ast=new Array($bracket.getLine(),$bracket.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text),$type.ast);}
      | st='struct' '{'   structFields/**structField*/ /**??????STRUCTFIELD O VARDEFINITION???????/***structField: ID* ':' type ';';***/ '}'
        {$ast = new Struct($st.getLine(),$st.getCharPositionInLine() + 1,$structFields.ast);}
      ;

structFields returns [List<StructField> ast = new ArrayList<StructField>()]: idList=ids dots=':' tp=type  ';'
                     {
                        for (Variable v : $idList.ast) {
                            $ast.add(new StructField(v.getLine(), v.getColumn(), $tp.ast, v.getName()));
                        }
                     }
                    ;


ids returns [List<Variable> ast = new ArrayList<Variable>()]:
            id1=ID { $ast.add(new Variable($id1.getLine(), $id1.getCharPositionInLine() + 1, $id1.text)); }
                (','id2=ID { $ast.add(new Variable($id2.getLine(), $id2.getCharPositionInLine() + 1, $id2.text)); })*
            ;

basicType returns [Type ast]:
              int='int'
              {$ast=new IntType($int.getLine(),$int.getCharPositionInLine());}
            | double='double'
              {$ast=new DoubleType($double.getLine(),$double.getCharPositionInLine());}
            | char='char'
              {$ast=new CharType($char.getLine(),$char.getCharPositionInLine());}
            | /*void**/
            ;

varDefinition: ID (',' ID)*  ':' type  ';';


/**PARAMETER IGUAL QUE varDef pero sin ;???????**/
parameter: ID* ':' type ;


/*LEXER PATTERNS*/

INT_CONSTANT: ([1-9][0-9]* | '0');

REAL_CONSTANT: (DOTTED_REAL|EXPONENT_REAL);

CHAR_CONSTANT:  (EXPLICIT_CHAR|NUMERIC_CHAR|SPECIAL_CHAR);

ID: ('_'|LETRA)(LETRA|INT_CONSTANT|'_')*;

ONE_LINE_COMMENT: '#'.*?('\n'|EOF) -> skip;

MULTI_LINE_COMMENT: '"''"''"'.*?'"''"''"' -> skip;

SPACE: ' ' -> skip;

TRASH:  ('\n'|'\r'|'\t') -> skip;


/**FRAGMENTS**/
fragment
EXPLICIT_CHAR: '\''.'\'';

fragment
NUMERIC_CHAR: '\'\\' INT_CONSTANT '\'';

fragment
SPECIAL_CHAR: '\'\\'('n'|'t')'\'';

fragment
LETRA:  [a-zA-Z];

fragment
DOTTED_REAL: ( (([1-9][0-9]*|'0')?'.'[0-9]+) /**Digits after point and digits at both sides**/
             | (([1-9][0-9]*|'0')+'.')/**Digits before point**/
             );

fragment
EXPONENT_REAL: (DOTTED_REAL|INT_CONSTANT)('e'|'E')('+'|'-')?INT_CONSTANT;








