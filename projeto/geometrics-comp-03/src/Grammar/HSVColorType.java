public class HSVColorType extends ColorType{
    public HSVColorType(){
        super("hsvColor");
    }
    @Override
    public boolean isValid(String hsv){
        String[] s = hsv.split("G|%");
        if(s.length != 3){
            return false;
        }
        int hue = Integer.parseInt(s[0]);
        int saturation = Integer.parseInt(s[1]);
        int value = Integer.parseInt(s[2]);

        boolean res = true;
        if(hue < 0 || hue > 360){
            res = false;
        }
        else if(saturation < 0 || saturation > 100){
            res = false;
        }
        else if(value < 0 || value > 100){
            res = false;
        }
        return res;
    }
}
