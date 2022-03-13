import java.util.HashMap;
import java.util.Map;

public abstract class Symbol {
    private String name;
    private Type type;
    private boolean hasValue = false;
    private String category;
    private Map<String, Symbol> symbols = new HashMap<String, Symbol>();

    public Symbol(String name, Type type, String category){
        this.name = name;
        this.type = type;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean hasValue() {
        return hasValue;
    }

    public String getCategory() {
        return category;
    }

    public void setValue(boolean value) {
        this.hasValue = value;
    }

    public void setCategory(String cat) {
        this.category = cat;
    }

    public void addSymbol(Symbol s) {
        symbols.put(s.name, s);
    }

    public boolean hasSymbol(String symName) {
        return symbols.containsKey(symName);
    }

    public Symbol getSymbol(String symName) {
        return symbols.get(symName);
    }

    public void setSymbolTable(Map<String,Symbol> m){
        symbols = m;
    }

    public Map<String,Symbol> getSymbols() {
        return symbols;
    }
    
}
