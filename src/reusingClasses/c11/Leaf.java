package reusingClasses.c11;

public class Leaf extends Tree{
    @Override
    protected void s() {
        System.out.println("Method override");
        super.s();
    }

}
