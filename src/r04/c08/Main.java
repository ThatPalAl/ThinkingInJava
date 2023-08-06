package r04.c08;

public class Main {
    public static void main(String[] args) {
        int val = 1;
        while(val < 30){
            switch(val){
                case 5: {
                    System.out.println("5");
                    break;
                }
                case 10:{
                    System.out.println("10");
                    break;
                }
                case 15:{
                    System.out.println(15);
                    break;
                }
                case 20:{
                    System.out.println(20);
                    break;
                }
                case 25:{
                    System.out.println(25);
                    break;
                }
                case 30:{
                    System.out.println("not gonna happen");
                }
                default:{
                    System.out.println(" -.- ");
                }
            }
            val++;
        }
    }
}
