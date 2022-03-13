import java.util.*;

public class AnimationSymbol extends Symbol {

    private ArrayList<Symbol> args = new ArrayList<Symbol>();


    public AnimationSymbol(String name) {
        super(name, null, "animation");
    }

    public void setArgs(ArrayList<Symbol> m){
        args = m;
    }

    public ArrayList<Symbol> getArgs() {
        return args;
    }

    public void putSymbol(Symbol s){
        args.add(s);
    }

    
}
