public class ColorType extends Type {

    protected ColorType(String name) {
        super(name);
    }

    @Override
    public boolean subType(Type other){
        return name.equals(other.getName()) || other.getName().equals("normalColor") || other.getName().equals("hexColor") || other.getName().equals("hsvColor") || other.getName().equals("rgbColor") || other.getName().equals("color");
    }

    public boolean isValid(String s){
        return true;
    }

    
}
