package r05.C09;

public class Main {
    public static void main(String[] args) {
        ThisConstr constr = new ThisConstr("Text");
        ThisConstr constr1 = new ThisConstr("Tekst", 9);
        ThisConstr constr2 = new ThisConstr(5, "Texting");

        System.out.println(constr.toString1());
        System.out.println(constr.toString2());

        System.out.println(constr1.toString1());
        System.out.println(constr1.toString2());

        System.out.println(constr2.toString1());
        System.out.println(constr2.toString2());

    }
}
