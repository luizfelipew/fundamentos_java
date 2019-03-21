package hackerranck;

public class TestClass {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        System.out.println(foodFactory.getFood("cake").getType());
        System.out.println(foodFactory.getFood("pizza").getType());

    }
}
