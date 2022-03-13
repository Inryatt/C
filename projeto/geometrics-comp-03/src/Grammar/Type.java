public abstract class Type {
    protected String name;

    protected Type(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean subType(Type other){
        return name.equals(other.getName());
    }

    @Override
    public String toString() {
        return "Type "+ name ;
    }
    
}
