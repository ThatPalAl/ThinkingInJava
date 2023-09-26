package r09.examples.e04;

public class Apply {
    public static void process(Processor p, Object o){
        System.out.println("I am using the " + p + " processor");
        System.out.println(p.process(o));
    }

    public static String s = "One of these mornings";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s
        );
    }
}
