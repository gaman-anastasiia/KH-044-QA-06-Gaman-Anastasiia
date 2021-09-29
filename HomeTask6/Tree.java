
public class Tree extends Plant{
    public Tree(String color, int height){
        super(color);
        super.height = 500;
    }
    public void grow(int age){
        System.out.println("Tree grows for" + age + " years!");

    }

}