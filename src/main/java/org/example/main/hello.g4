grammar hello;

r   :   '\u043f\u0440\u0438\u0432\u0435\u0442' ID ; //привет
ID  :   [\u0430-\u044f]+ ; //а-я
WS  :   [ \t\r\n]+ -> skip ;