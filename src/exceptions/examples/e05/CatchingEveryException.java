package exceptions.examples.e05;

public class CatchingEveryException {
    public static void main(String[] args) {
        int[] array = new int[5];
        try{
            array[6] = 7;
        }catch (Exception e){
            System.out.println(e.getClass());
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
