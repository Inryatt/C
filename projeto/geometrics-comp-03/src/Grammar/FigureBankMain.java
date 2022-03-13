import java.io.IOException;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class FigureBankMain {

   private static int errorCount = 0;

   public static Map<String,Symbol> SimbTable = new HashMap<String,Symbol>();
   public static void figurebank(String[] args) {
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
            FigureBankCheck visitor0 = new FigureBankCheck();
            visitor0.visit(tree);
            SimbTable = visitor0.getSymbolTable();
            errorCount = visitor0.getErrorCount();
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }

   public static Map<String,Symbol> getSymbolTable() {
      return SimbTable;
   }

   public static int getErrorCount(){
      return errorCount;
   }
}
