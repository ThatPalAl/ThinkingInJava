package interfaces.examples.e05;

public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input ){
        return input;
    }
}
