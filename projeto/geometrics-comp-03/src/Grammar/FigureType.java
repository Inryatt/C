public class FigureType extends Type {

    private String[] generalProperties = {
        "hidden",
        "center",
        "scale",
        "angle",
        "fill",
        "fill_color",
        "border",
        "border_color",
        "thickness",
        "position",
        "pivot",
        "layer"
    };

    protected String[] uniqueProperties = {};

    protected FigureType(String name) {
        super(name);
    }

    /**
     * Determine if given property is valid for this figure type
     * @param prop_name The property name
     * @return true if valid, false otherwise
     */
    public boolean isValidProperty(String prop_name) {
        for (int i = 0; i < generalProperties.length; i++)
            if (prop_name.equals(generalProperties[i]))
                return true;
        
        for (int i = 0; i < uniqueProperties.length; i++)
            if (prop_name.equals(uniqueProperties[i]))
                return true;
        
        return false;
    }
}
