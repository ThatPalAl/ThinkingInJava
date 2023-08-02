package r05.C05;
public class Dog {

    void bark(){
        System.out.println("Woof!");
    }

    void bark(String type){
        if(type.equalsIgnoreCase("wolf")){
            System.out.println("Aaaaauuuuu!!!");
        } else if (type.equalsIgnoreCase("doge")){
            System.out.println("woof woof woff");
        }
        else{
            System.out.println("woooof!");
        }
    }

    void bark(int count){
        for(int i = 0; i < count; i++){
             bark();
        }
    }
}
