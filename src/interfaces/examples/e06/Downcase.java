package interfaces.examples.e06;

public class Downcase extends StringProcessor {

    public String process(Object input) {
        return ((String)input).toLowerCase();

    }
}
