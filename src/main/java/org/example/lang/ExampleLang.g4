grammar ExampleLang;

@header {
import java.util.HashMap;
import java.util.Map;
}

@members {
public int result = 0;
Map<String, Integer> vars = new HashMap<>();
}

start
    : expression EOF {result = $expression.value;}
    ;

expression returns[int value]
    : t1=term {$value = $t1.value;}
    ('+' t2=term {$value += $t2.value;}
    | '-' t2=term {$value -= $t2.value;})*
    ;

term returns[int value]
    : a1=atom {$value = $a1.value;}
    ('*' a2=atom {$value *= $a2.value;}
    | '/' a2=atom {$value /= $a2.value;})*
    ;

atom returns[int value]
    : NUMBER {$value = Integer.parseInt($NUMBER.text);}
    | LPAREN expression RPAREN {$value = $expression.value;}
    ;

NUMBER      :       [0-9]+ ;
PLUS        :       '+' ;
MINUS       :       '-' ;
TIMES       :       '*' ;
DIV         :       '/' ;
LPAREN      :       '(' ;
RPAREN      :       ')' ;

WS          :       [ \t\r\n]+ -> skip ;

