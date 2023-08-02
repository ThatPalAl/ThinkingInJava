package r05.C02;

public class Main {
    public static void main(String[] args) {
        Component component = new Component();
        ConstrComponent constrComponent = new ConstrComponent("Text");
        //ConstrComponent constrComponent1 = new ConstrComponent();

        component.comp = "Class with one String component";
        constrComponent.ConstComp = "Overwriting the Constructor class conmponent";

        //Object identification
        System.out.println(component);
        System.out.println(constrComponent);

        System.out.println();

        System.out.println(component);
        System.out.println(constrComponent);
    }
}
