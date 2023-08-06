package r02.c06;

public class R02C06 {
    public static void main(String[] args) {
        System.out.println(WielkaKlasa.sWielkosc("scope"));
        WielkaKlasa wielkaKlasa = new WielkaKlasa();
        System.out.println(wielkaKlasa.wielkosc("SMS"));


    }
}
class WielkaKlasa {

    public int wielkosc(String s) {
        return s.length() * 2;
    }

    public static int sWielkosc(String s) {
        return s.length() * 2;
    }
}