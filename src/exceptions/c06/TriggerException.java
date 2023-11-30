package exceptions.c06;

public class TriggerException {
    public static void h(String message) throws ExceptionOne {
        System.out.println("Throwing ExceptionOne exception from h()");
        throw new ExceptionOne(message);
    }

    public static void main(String[] args) {
        try{
            h("Message that I've provided");
        } catch (ExceptionOne one){
            System.out.println("whatever");
        }
    }
}
