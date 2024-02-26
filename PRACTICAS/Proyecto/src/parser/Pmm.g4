grammar Pmm;
@header{
    import ast.expression.*;
    import ast.node.*;
}

program returns [ASTNode ast]: definition* main EOF
       ;

expression returns [Expression ast]:  INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
            | REAL_CONSTANT {$ast = new FloatLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
            | CHAR_CONSTANT {$ast = new Char($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
            | ID {$ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
            | functioninvocation {$ast = $functioninvocation.ast;}
            | '(' expression ')'
            | e1=expression pos='[' e2=expression ']' {$ast = new ArrayAccess($pos.getLine(),$pos.getCharPositionInLine(),$e1.ast,$e2.ast);}/**ARRAY ACCESS**/
            | e=expression '.' ID /*Struct access*/ {$ast = new StructAccess($ID.getLine(),$ID.getCharPositionInLine(),$ID.text,$e.ast);}
            | pos='(' t=type ')' exp=expression {$ast=new Cast($pos.getLine(),$pos.getCharPositionInLine(),);}
            | '-' expression
            | '!' expression
            | expression ('*'|'/'|'%') expression
            | expression ('+'|'-') expression
            | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
            | expression ('&&'|'||') expression

            ;


main: 'def' 'main' '(' ')'':''{' varDefinition*  statementList '}'

            ;

statement: 'return' expression ';'
          | 'print' expressionList ';'
          | 'input' expressionList ';'
          | expression '=' expression ';'
          | 'while' expression ':' '{' statementList '}'
          | 'if' expression ':' statementList ('else' ':' statementList)?
          | functioninvocation ';'/**??????????????????????????***/
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

type:   basicType
      | '[' INT_CONSTANT ']' type
      | 'struct' '{'   varDefinition* /**structField*/ /**??????STRUCTFIELD O VARDEFINITION???????/***structField: ID* ':' type ';';***/ '}'
      ;



basicType:  'int'
            | 'double'
            | 'char'
            | /*void**/
            ;

varDefinition: expression (',' expression)*  ':' type  ';';
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








