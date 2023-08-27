package r08.examples.e11;

public class Mill {
    Grain process(){
        return new Grain();
    }

    @Override
    public String toString() {
        return "Mill";
    }
}
