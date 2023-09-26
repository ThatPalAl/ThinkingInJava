package r09.examples.e04;

public class Downcase extends Processor {
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}
