package interfaces.examples.e06;

public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s = "If she weights the same as a duck does, it means she is made from wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);

    }

}
