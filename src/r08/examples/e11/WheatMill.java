package r08.examples.e11;

public class WheatMill extends Mill {
    Wheat process(){
        return new Wheat();
    }

    String process(String a){
        return "Trust the process " + a;
    }
}
