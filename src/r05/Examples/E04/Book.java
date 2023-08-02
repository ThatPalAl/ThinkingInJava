package r05.Examples.E04;

public class Book {
    boolean checkedOut ;
    Book(boolean checkOut){
        this.checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }

    protected void finalize() throws Throwable {
        if(checkedOut){
            System.out.println("Error occurred");
        }
        super.finalize();

    }
}
