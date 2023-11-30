package exceptions.c04;

public class MyOwnExceptions {
    public static void main(String[] args) {
        int[] array = {1,2,4,8,16,32};
        int[] res = new int[5];
        int index = 0;
        try {
            implementRes(array, res);
        } catch (OwnException e){
            System.out.println("my own exception occurred, index out of bounds."); //just prompting whatever in catch
            e.shout(); //exception method
        }
    }

    public static void implementRes(int[] arr1, int[] arr2) throws OwnException{
        for(int i = 0; i < arr1.length; i++){
            if(i >= arr2.length){
                throw new OwnException("whatever"); //provide a value to the Exception object
            }
            else {
                arr2[i] = arr1[i] * arr1[i];
            }
        }

    }
}
