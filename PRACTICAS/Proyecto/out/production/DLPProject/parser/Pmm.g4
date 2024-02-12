grammar Pmm;	

program: 
       ;


 /*LEXER PATTERNS*/

INT_CONSTANT: [1-9][0-9]* | '0'
            ;

ONE_LINE_COMMENT: '#'.*?('\n'|EOF);

MULTI_LINE_COMMENT: '"''"''"'.*?'"''"''"';

IDENTIFIER:
            ('_'|LETRA)(LETRA|INT_CONSTANT|'_')*
            ;

fragment
LETRA:  [a-zA-Z]
    ;


SPACE: ' ' -> skip;

TRASH:  ('\n'|'\r') -> skip;






