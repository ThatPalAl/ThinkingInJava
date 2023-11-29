package initalization_cleanUp.c04;

public class Main {
    public static void main(String[] args) {
        firstNumbers(7);
    }

    public static void firstNumbers(int val){
        int counter = 0;
        for(int i = 1; i < val; i++){
            if(val % i == 0){
                counter++;
            }
        }
        if(counter == 2) {
            System.out.println("number dividable only by itself and by one.");
        }
    }
}
