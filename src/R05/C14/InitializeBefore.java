package R05.C14;

public class InitializeBefore {
    static String field1 = "Text";

    static String field2;
    static {
        field2 = "Text2";
    }

    static void func(){
        System.out.println("field1: " +field1);
        System.out.println("field2: " + field2);
    }
}
