
public class Chamomile extends Flower{
   public Chamomile(String color){
       super(color);
       super.height = 32;
    }

    @Override
    public void grow(int quantityOfPetals) {
        System.out.println("A beauty Chamomile has " + quantityOfPetals+" petals");
    }
}

