package org.example.main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;


public class MyListener extends helloBaseListener {
    @Override
    public void exitR(helloParser.RContext ctx) {
        String s = "Привет";
        if (ctx.ID().getText().equalsIgnoreCase("Ярослав")) System.out.println(s);
        else System.out.println(s + ", но меня зовут не так. Моё имя Ярослав.");
    }

    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("");
        helloLexer lexer = new helloLexer(input);
        helloParser parser = new helloParser(new CommonTokenStream(lexer));
        parser.addParseListener(new MyListener());
        parser.r();
    }
}
