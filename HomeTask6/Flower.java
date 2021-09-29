
public class Flower extends Plant {
   public Flower(String color){
       super(color);
       super.height = 50;
   }

   public Flower(String color, int height){
       super(color) = color;
       super.height = height;
   }

    @Override
    public void grow() {
       System.out.println("All Flowers grows up");
    }
}



















