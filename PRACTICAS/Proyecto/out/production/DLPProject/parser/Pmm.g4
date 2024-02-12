grammar Pmm;	

program: 
       ;


/*LEXER PATTERNS*/

INT_CONSTANT: ([1-9][0-9]* | '0');

REAL_CONSTANT: (DOTTED_REAL|EXPONENT_REAL);

CHAR_CONSTANT:  (EXPLICIT_CHAR|NUMERIC_CHAR|SPECIAL_CHAR);

IDENTIFIER: ('_'|LETRA)(LETRA|INT_CONSTANT|'_')*;

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








