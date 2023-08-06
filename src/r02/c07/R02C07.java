package r02.c07;

public class R02C07 {
    static int var = 7;
    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        StaticFun.incr();
        System.out.println(StaticTest.i);

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();


        StaticTest.i++;
        System.out.println(StaticTest.i);

        System.out.println(StaticTest.i);
        System.out.println(st1);
        R02C07 r02C07a = new R02C07();
        R02C07 r02C07b = new R02C07();
        System.out.println(r02C07a.var + " - " + r02C07b.var);
        r02C07a.var++;
        System.out.println(r02C07a.var + " - " + r02C07b.var);


    }
}

class StaticTest{
    static int i = 47;
}

class StaticFun{
    static void incr(){
        StaticTest.i++;
    }
}
