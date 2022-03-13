public class RGBColorType extends ColorType {
    public RGBColorType(){
        super("rgbColor");
    }
    @Override
    public boolean isValid(String rgb){
        String[] s = rgb.split("-");
        if(s.length != 3){
            return false;
        }
        int red = Integer.parseInt(s[0]);
        int green = Integer.parseInt(s[1]);
        int blue = Integer.parseInt(s[2]);
        boolean res = true;
        if(red < 0 || red > 255){
            res = false;
        }
        else if(green < 0 || green > 255){
            res = false;
        }
        else if(blue < 0 || blue > 255){
            res = false;
        }
        return res;
    }
}
