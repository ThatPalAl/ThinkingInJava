package r09.examples.e06;

public class Upcase extends StringProcessor {
    public String process(Object input){
        return ((String) input).toUpperCase();
    }
}
