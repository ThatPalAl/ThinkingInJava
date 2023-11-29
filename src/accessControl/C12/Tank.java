package accessControl.C12;

public class Tank {
    boolean filled;

    public Tank(boolean filled) {
        this.filled = filled;
    }

    void fill(){
        if(filled){
            System.out.println("It's already filled.");
        }
        else {
            System.out.println("Filling the container");
            filled = true;
        }
    }

    void fill(boolean filled){
        if(filled){
            System.out.println("It's already filled.");
        }
        else {
            System.out.println("Filling the container");
            this.filled = true;
        }
    }

    void empty(boolean filled){
        if(filled){
            System.out.println("Emptying the container.");
            this.filled = false;
        }
        else {
            System.out.println("It's already empty.");
        }
    }

    void empty(){
        if(filled){
            System.out.println("Emptying the container.");
            filled = false;
        }
        else {
            System.out.println("It's already empty.");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if(!this.filled) {
            System.out.println("Finalized");
            super.finalize();
        }
        else {
            System.out.println("It needs to be empty, before finalization continues");
        }
    }
}
