package polymorphism.examples.e05;

public class FieldAccess {
    public static void main(String[] args) {
        Super suppper = new Super();
        System.out.println("sup.field = " + suppper.field);
        System.out.println("sup.getField() = " + suppper.getField());

        Super sup = new Sub(); //casting upwards
        System.out.println("sup.field = " + sup.field);
        System.out.println("sup.getField() = " + sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field);
        System.out.println("sub.getField() = " + sub.getField());
        System.out.println("sub.getSuperField() = " + sub.getSuperField());

    }
}
