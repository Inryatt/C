public class HexColorType extends ColorType {

    private static final String HEXCOLOR = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";

    public HexColorType(){
        super("hexColor");
    }
    
    @Override
    public boolean isValid(String hex){
        boolean res = true;
        if(!hex.matches(HEXCOLOR)){
            res = false;
        }
        return res;
    }
}
