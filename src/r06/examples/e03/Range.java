package r06.examples.e03;

public class Range {
    public static int[] range(int n) {
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int start, int end){
        int size = end - start;
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = start + i;
        }
        return  result;
    }

    public static int[] range(int start, int end, int step){
        int size = (end - start) / step;
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = start + (i * step);
        }
        return result;
    }
}
