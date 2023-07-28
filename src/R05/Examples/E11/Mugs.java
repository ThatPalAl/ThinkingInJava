package R05.Examples.E11;

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("Objects from class Mug have been initialized");
    }

    public Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i){
        System.out.println("Mugs(int)");
    }
}
