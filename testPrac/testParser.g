grammar testParser;

prog: stat* EOF;

stat: (display|assign) ';';

display: 'display' expr;

assign: 'assign' expr;

expr: fraction  #exprFraction
    | ID        #exprId
    ;

fraction: INT ('/' INT)?;
ID: [a-z]+;
INT:[0-9]+;


COMMENT: '--' .*? '\n' ->skip;
WS:[ \t\n\r]+ -> skip;
ERROR: .;