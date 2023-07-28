package R05.Examples.E09;

public class Table {
    static Bowl bowl1 = new Bowl(1);

    public Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}