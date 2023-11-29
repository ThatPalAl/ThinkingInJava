package interfaces.examples.e04;

public class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}
