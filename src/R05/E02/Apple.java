package R05.E02;

public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
