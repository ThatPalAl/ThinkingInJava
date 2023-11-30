package exceptions.c03;

public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        try{
            for(int i = 0; i <= array.length; i++){
                System.out.println(array[i]);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Check your loop condition, seems like the array index is overreached");
        }
    }
}
