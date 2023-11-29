package interfaces.examples.e06;

public class Apply {
    public static void process(Processor p, Object o){
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(o));
    }
}
