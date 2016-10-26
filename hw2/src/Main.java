/**
 * Created by puxuan on 2016/10/25.
 */

import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = args[0];
        InputStream is = System.in;

        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);

        cmmLexer lexer = new cmmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cmmParser parser = new cmmParser(tokens);
        ParseTree tree = parser.program();
        cmmBaseVisitor vist = new cmmBaseVisitor();
        vist.visit(tree);
    }
}