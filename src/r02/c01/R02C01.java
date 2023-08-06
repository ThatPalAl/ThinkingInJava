package r02.c01;

public class R02C01 {
    public static void main(String[] args) {
        System.out.println(BaseC01.var1);
        BaseC01 baseC01 = new BaseC01();
        System.out.println(baseC01.var2);
        System.out.println(baseC01.var3);
        System.out.println(BaseC01.var4);
    }
}

class BaseC01 {
    static int var1;
    char var2;
    int var3;
    static char var4;


}
