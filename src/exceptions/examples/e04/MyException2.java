package exceptions.examples.e04;

public class MyException2 extends Exception {
    private int x;

    public MyException2() {}

    public MyException2(String msg){
        super(msg);
    }

    public MyException2(String message, int x) {
        super(message);
        this.x = x;
    }

    public int val(){
        return x;
    }

    public String getMessage(){
        return "Detailed communicate: " + x + " " + super.getMessage();
    }
}
