package reusingClasses.c07;

public class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root() {
        System.out.println("Root's class default constructor");
    }

    public Root(Component1 component1, Component2 component2, Component3 component3) {
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
        System.out.println("Root's class constructor");
    }
}
