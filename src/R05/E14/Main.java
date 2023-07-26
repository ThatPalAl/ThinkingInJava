package R05.E14;

import R05.E13.A;
import R05.E13.B;

public class Main {
    public static void main(String[] args) {
//        NewVarArgs.printArrar(new Integer(46), new Float(3.14));
        NewVarArgs.printArrar(47, 3.14F, 11.11);
        NewVarArgs.printArrar("One", "Two","Three");
        NewVarArgs.printArrar(new A(), new B(100));
        NewVarArgs.printArrar((Object[])  new Integer[]{
                1,2,3,4,5
        });
        NewVarArgs.printArrar();
        NewVarArgs nva = new NewVarArgs();
        NewVarArgs.printArrar(nva);
    }
}
