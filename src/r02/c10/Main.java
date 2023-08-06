package r02.c10;

public class Main {
    /**
     * Testing
     *
     */
    int liczbaCalkowitaKolorow;
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[2]);
//        System.out.println(args[1]);

        Main main = new Main();
        main.zmienOdcienKoloru(27);
    }
    void zmienOdcienKoloru(int nowyOdcien){
        liczbaCalkowitaKolorow = nowyOdcien;
    }
}