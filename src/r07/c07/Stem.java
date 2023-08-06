package r07.c07;

public class Stem extends Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Stem(Component1 component1, Component2 component2, Component3 component3, Root root) {
        super(component1, component2, component3);
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
        System.out.println("Stem's class constructor");
    }
}
