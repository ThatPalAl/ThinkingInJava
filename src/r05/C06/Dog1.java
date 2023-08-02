package r05.C06;

public class Dog1 {

    void bark_(){
        System.out.println("Woof!!!");
    }
    void bark_S_I(String type, int count){
        for(int i = 0; i < count; i++) {
            if (type.equalsIgnoreCase("wolf")) {
                bark_();
            } else if (type.equalsIgnoreCase("doge")) {
                System.out.println("woof woof woff");
            } else {
                System.out.println("woooof!");
            }
        }
    }

    void bark_I_S(int count, String type){
        for(int i = 0; i < count; i++){
            if(type.equalsIgnoreCase("dog")){
                System.out.println("woooof, wooof");
            } else if (type.equalsIgnoreCase("wild dog")) {
                System.out.print("wild ");
                bark_();
            }
            else {
                bark_();
                System.out.println("......");
            }
        }
    }
}
