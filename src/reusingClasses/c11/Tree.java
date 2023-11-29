package reusingClasses.c11;

public class Tree extends Root {
//    @Override
    private final void f(){
        System.out.println("Tree class - final and private method");
    }

//    @Override
    private void g(){
        System.out.println("Tree class - private method");
    }

    protected final void t(){
        System.out.println("Tre class - protected and final method");
    }

    protected void s(){
        System.out.println("Tree class - protected method");
    }
}
