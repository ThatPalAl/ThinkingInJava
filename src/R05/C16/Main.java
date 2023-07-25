package R05.C16;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[3];
        String str1 = new String("1");
        String str2;
        str2 = new String("2");
        String str3 = "3";
        array[0] = str1;
        array[1] = str2;
        array[2] = str3;
        for (String s: array) {
            System.out.print(s + " ");
        }
    }
}
