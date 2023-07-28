package R05.Examples.E01;

public class Main {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.print();
        leaf.increment().increment().increment().increment().print();

        Leaf leaf1 = new Leaf();
        leaf1.returnObject(15);
    }
}

