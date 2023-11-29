package polymorphism.examples.e13;

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
//        x[1].v();
        ((MoreUseful)x[1]).u(); //casting downwards
        try {
            ((MoreUseful)x[0]).v(); //exception occurs
        }
        catch (ClassCastException cce){
            System.out.println("Wrong class casting");
        }
//        ((MoreUseful)x[0]).v();

        MoreUseful[] x2 = {new MoreUseful(),
//                (MoreUseful) new Useful(),
                new MoreUseful()
        };
        x2[0].f();
//        x2[1].f();
        x2[1].w();

    }
}
