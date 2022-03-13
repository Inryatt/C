public class VariableSymbol extends Symbol {

    public VariableSymbol(String name, Type type, String category) {
        super(name, type, category);
    }
    
    public String toString() {
        return super.getName();
    }
}
