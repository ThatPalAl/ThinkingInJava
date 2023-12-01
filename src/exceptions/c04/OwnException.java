package exceptions.c04;

public class OwnException extends Exception {

    int counter;
    private String msg;
    public OwnException() {

    }

    public OwnException(String message) {
        super(message);
        this.msg = message;
        System.out.println("My own exception object created " + msg);
    }

    public void shout(){
        System.out.println("I am my own exception, shouting at you, but not in red font");
    }

}
