package r05.C18;

import java.util.ArrayList;
import java.util.List;

public class VarArgNumber {
    static List<String> list = new ArrayList<>();
    static void f(String... args){
        for(String s: args){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array1 = new String[3];
        array1[0] = "Uno";
        array1[1] = "Dos";
        array1[2] = "Tres";
        String[] array2 = {"One", "Two", "Three", "Four"};
        String str1 = "Text";
        String str2;
        list.add(str1);
        String str3 = str1.toUpperCase();

        f(array1);
        f(array2);
        f(str1);
//        f(str2);
        f(str3);
        f(String.valueOf(list));
        f("one", "TWO", "three", "four");
        f(new String[]{"1", "2", "3", "4"});

    }
}
