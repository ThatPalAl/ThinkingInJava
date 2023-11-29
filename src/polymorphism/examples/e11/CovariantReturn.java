package polymorphism.examples.e11;

public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println(mill);
        System.out.println(grain);

        mill = new WheatMill();
        grain = mill.process();

        System.out.println(mill);
        System.out.println(grain);

    }
}
