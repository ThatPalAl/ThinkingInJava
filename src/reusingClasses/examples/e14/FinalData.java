package reusingClasses.examples.e14;

import java.util.Random;

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] arr = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return id + ':' +
                ", i4=" + i4 +
                ", INT_5 " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("id1");
//        fd1.valueOne++;
        fd1.v2.i++;
        fd1.v1 = new Value(10);
        for(int i = 0; i < fd1.arr.length; i++) {
            fd1.arr[i]++;
        }
//            fd1.v2 = new Value(0);
//            fd1.VAL_3 = new Value(10);
//            fd1.arr = new int[10];
        System.out.println(fd1);
        System.out.println("New FinalDatab object");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);

    }


}
