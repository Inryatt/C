public class GroupType extends Type {
    
    private int size = 0;

    protected GroupType() {
        super("group");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
