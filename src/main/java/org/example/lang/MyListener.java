package org.example.lang;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.*;


import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.*;

public class MyListener extends ExampleLangBaseListener {

    public static void main(String[] args) throws IOException {
        int opcode = 3;
        CharStream input = CharStreams.fromFileName(args[0]);
        ExampleLangLexer lexer = new ExampleLangLexer(input);
        ExampleLangParser parser = new ExampleLangParser(new CommonTokenStream(lexer));
        parser.addParseListener(new MyListener());
        parser.start();
        //System.out.println(parser.result);


        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(
                V1_8,
                ACC_PUBLIC,
                "Generated",
                null,
                "java/lang/Object",
                null
        );
        MethodVisitor mainmv = cw.visitMethod(
                ACC_PUBLIC + ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V",
                null,
                null
        );
        mainmv.visitCode();
        mainmv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

        //ICONST_M1 — 2, ICONST_0 — 3, ICONST_5 — 8
        if (parser.result >= -1 && parser.result <= 5) {
            opcode += parser.result;
            mainmv.visitInsn(opcode);
        }
        else if (parser.result >= -128 && parser.result <= 127) mainmv.visitIntInsn(BIPUSH, parser.result);
        else mainmv.visitIntInsn(SIPUSH, parser.result);

        mainmv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
        mainmv.visitInsn(RETURN);
        mainmv.visitMaxs(-1, -1);
        cw.visitEnd();

        byte[] bytes = cw.toByteArray();
        try (FileOutputStream stream = new FileOutputStream("Generated.class")) {
            stream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
