package R05.Examples.E02;

public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
