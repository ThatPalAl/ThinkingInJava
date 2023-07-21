package R05.E03;

public class Flower {
    int petalCount = 0;
    String s = "starting value";

    public Flower() {

    }
    public Flower(int petalCount) {
        this.petalCount = petalCount;
    }

    public Flower(String s) {
        this.s = s;
    }

    public Flower(int petalCount, String s) {
        this.petalCount = petalCount;
        this.s = s;
    }


}
