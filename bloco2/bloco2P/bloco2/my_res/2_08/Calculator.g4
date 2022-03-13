grammar Calculator ;

program:
    stat* EOF
    ;

stat:
    assignment? expr? NEWLINE| expr?  NEWLINE
    ;

assignment: ID '=' expr;
expr:  
        '-' expr                        #ExprNeg
    |   '+' expr                        #ExprPos
    |   expr op=('*'| '/'| '%') expr    #ExprMultDivMod 
    |   expr op=('+'| '-')  expr        #ExprAddSub
    |   Integer                         #ExprInteger
    |   ID                              #ExprId
    |   '(' expr ')'                    #ExprParent
    ;

Integer: [0-9]+;    //no
NEWLINE:    '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT : '#' .*? '\n' -> skip;
ID: [a-zA-Z_]+ ;
