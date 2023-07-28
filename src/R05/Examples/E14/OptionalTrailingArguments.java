package R05.Examples.E14;

public class OptionalTrailingArguments {
    static void f(int required, String... trailing){
        System.out.print("Required: " + required + " ");
        for(String s : trailing){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static void f(int required, int... anything){
        System.out.print("Required: " + required + " ");
        for (int l: anything) {
            System.out.print(l * 3 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0,"one","one","one","one","one","one","one","one","one","one","one","one","one","one","one");
        f(4, "100");

        f(1, 123123123, 213213, 123123123, 123,312321,123123231);
        f(2, 0);
        f(3, 1111, 2222, 3333);
    }
}
