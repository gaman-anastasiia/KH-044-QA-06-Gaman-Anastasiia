
public abstract class Plant{
    protected String color;
    protected int height;

    public Plant (int height){
        this.height = height;
    }
    public Plant (String color){
        this.color = color;
    }
    public abstract void grow();
}





