package R05.E13;

public class Main {
    public static void main(String[] args) {
//        printArray(new Object[]{
//                new Integer(47), new Float(3.13), new Double(11.11)
//        });
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
        printArray(new Object[]{new B(10), new B(20), new B(30)});
    }
    static void printArray(Object[] args) {
        for (Object o : args) {
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }
}
