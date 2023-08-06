package r07.examples.e09;

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Knife kf;
    private Fork fk;
    private DinnerPlate plt;

    public PlaceSetting(int i) {
        super(i);
        sp = new Spoon(i + 2);
        fk = new Fork(i + 3);
        kf = new Knife(i + 4);
        plt = new DinnerPlate(i + 5);
        System.out.println("Place Setting class constructor");
    }
}
