package polymorphism.examples.e05;

public class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField(){
        return super.field;
    }
}
