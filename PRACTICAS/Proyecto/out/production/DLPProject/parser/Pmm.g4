grammar Pmm;	

program: definition* EOF
       ;

expression:  INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID
            | functioninvocation/**??????????????????????????***/
            | '(' expression ')'
            | expression'[' expression ']' /**ARRAY ACCESS**/
            | expression '.' ID /*Struct access*/
            | '(' type ')' expression
            | '-' expression
            | '!' expression
            | expression ('*'|'/'|'%') expression
            | expression ('+'|'-') expression
            | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
            | expression ('&&'|'||') expression

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

expressionList: (expression (',' expression)* )?;

functioninvocation: /**function variable*/ ID '(' expressionList ')' ;



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








