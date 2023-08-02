package r06.examples.e03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = Range.range(10);
        int[] arr2 = Range.range(5, 20);
        int[] arr3 = Range.range(3, 12, 3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
