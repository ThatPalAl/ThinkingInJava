package interfaces.c05;

public class Main {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();

        System.out.println("-----------------------------------");
        Bread ciabatta = new Bread();
        Lettuce spinach = new Lettuce();
        Cheese cheddar = new Cheese();
        Pickle pickledOnions = new Pickle();
        Sandwich grandmaSandwich = new Sandwich(ciabatta, spinach, cheddar, pickledOnions);

    }
}
