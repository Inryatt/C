public class IntegerType extends Type {

    protected IntegerType() {
        super("int");
    }
    @Override
    public boolean subType(Type other){
        return super.subType(other) || other.getName().equals("double");
    }
}
