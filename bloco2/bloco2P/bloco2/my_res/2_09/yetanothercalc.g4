grammar yetanothercalc ;

program:
    stat* EOF
    ;

stat:
    expr+   NEWLINE* | assignment+  NEWLINE*
    ;

assignment: expr '->' ID Term;

expr:  
        'print' expr Term               #ExprPrint
    |   Frac                            #ExprFrac
    |   ID                              #ExprId
    ;

Integer: [0-9]+;
Frac: Integer'/'Integer;
Term: ';';
NEWLINE:    '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT : '#' .*? '\n' -> skip;
ID: [a-zA-Z_]+ ;