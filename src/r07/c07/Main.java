package r07.c07;

public class Main {
    public static void main(String[] args) {
        Component1 component1 = new Component1(1);
        Component2 component2 = new Component2(2);
        Component3 component3 = new Component3(3);
        Root root = new Root(component1, component2, component3);
        Stem stem = new Stem(component1, component2, component3, root);
    }
}
