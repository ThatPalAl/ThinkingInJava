package polymorphism.examples.e06;

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper staticSuper = new StaticSuper();
        System.out.println(staticSuper.staticGet());
        System.out.println(staticSuper.dynamicGet());

        StaticSuper sup = new StaticSub(); //casting upwards
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());

    }
}
