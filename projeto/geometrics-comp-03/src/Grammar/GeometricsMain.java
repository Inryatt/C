import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class GeometricsMain {
   public static void main(String[] args) {
      try {
         if(args.length != 1){
            System.err.println("Invalid number of arguments");
            System.exit(1);
         }
         String fileName = args[0];
         if(fileName.length() < 5){
            System.err.println("ERROR: invalid file name: " + fileName);
         }
         String extension = fileName.substring(fileName.length() - 4);
         //System.out.println(extension);
         if(!extension.equals(".geo")){
            System.err.println("ERROR: invalid file extension: " + fileName);
            System.exit(1);
         }

         File f = new File(fileName);
         if(!f.isFile()){
            System.out.println("ERROR: file does not exists");
            System.exit(1);
         }


         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(fileName);
         // create a lexer that feeds off of input CharStream:
         GeometricsLexer lexer = new GeometricsLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         GeometricsParser parser = new GeometricsParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at prog rule:
         ParseTree tree = parser.prog();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            SemanticChecker visitor0 = new SemanticChecker();
            GeoCompiler visitor1 = new GeoCompiler();
            visitor0.visit(tree);

            if(visitor0.getErrorCount() == 0){
               visitor1.setFN(fileName);
               visitor1.visit(tree);
            }
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
}
