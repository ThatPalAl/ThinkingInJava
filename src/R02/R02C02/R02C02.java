package R02.R02C02;

public class R02C02 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        TylkoDane dane = new TylkoDane();
        dane.i = 47;
        dane.d = 1.1;
        dane.b = false;
        System.out.println(dane.i + "\n" + dane.d + "\n" + dane.b);
        dane.d = 3;
        System.out.println(dane.i + "\n" + dane.d + "\n" + dane.b);
    }
}
class TylkoDane{
    int i;
    double d;
    boolean b;
}
