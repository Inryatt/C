import java.io.IOException;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

public class FigureBankCompile {
    public static ST figurebank(String[] args) {
        ST res;
        try {
            // create a CharStream that reads from standard input:
            CharStream input = CharStreams.fromFileName(args[0]);
            // create a lexer that feeds off of input CharStream:
            FigureBankLexer lexer = new FigureBankLexer(input);
            // create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer:
            FigureBankParser parser = new FigureBankParser(tokens);
            // replace error listener:
            //parser.removeErrorListeners(); // remove ConsoleErrorListener
            //parser.addErrorListener(new ErrorHandlingListener());
            // begin parsing at prog rule:
            ParseTree tree = parser.prog();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                // print LISP-style tree:
                // System.out.println(tree.toStringTree(parser));
                FBCompiler visitor0 = new FBCompiler();
                res = visitor0.visit(tree);
                return res;
            }
        }
        catch(IOException e) {
            e.printStackTrace();
            return null;
        }
        catch(RecognitionException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
