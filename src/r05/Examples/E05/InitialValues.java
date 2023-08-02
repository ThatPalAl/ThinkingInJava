package r05.Examples.E05;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    InitialValues reference;
    void printInitialValues(){
        System.out.println("Data type:    Default value:");
        System.out.println("boolean      " + t);
        System.out.println("char         " + c);
        System.out.println("byte         " + b);
        System.out.println("short        " + s);
        System.out.println("int          " + i);
        System.out.println("long         " + l);
        System.out.println("float        " + f);
        System.out.println("double       " + d);
        System.out.println("Reference    " + reference);
    }

}
