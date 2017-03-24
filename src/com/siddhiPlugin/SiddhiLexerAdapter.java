package com.siddhiPlugin;

import com.intellij.lexer.FlexAdapter;
import com.siddhiPlugin.resources.SiddhiLexer;
import com.siddhiPlugin.resources.SiddhiParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.Reader;

/**
 * Created by yellowflash on 3/14/17.
 */
public class SiddhiLexerAdapter {
    public static void main(String[] args) {
        ANTLRInputStream input = new ANTLRInputStream("define stream TempStream (deviceID long, roomNo int, temp double);");
        SiddhiLexer lexer= new SiddhiLexer(input);
        CommonTokenStream token= new CommonTokenStream(lexer);
        SiddhiParser parser= new SiddhiParser(token);

        System.out.println(parser.definition_stream().toStringTree(parser));
    }
}
