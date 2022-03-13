grammar hello ;
// parser:
greetings: 'hello' ID ;
// lexer:
ID: [a-z]+ ;
WS: [ \t\r\n]+ -> skip;
