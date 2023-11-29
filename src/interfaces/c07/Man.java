package interfaces.c07;

import java.util.Arrays;
import java.util.Date;

public class Man extends Person implements IFaceChild {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void electChild(String name) {
        System.out.println(name + " has been elected, instead of " + this.name);
    }

    @Override
    public void maxNum1(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    @Override
    public void minNum1(int[] arr2) {
        int min = 0;
        for(int i = 0; i < arr2.length; i++){
            if(min > arr2[i]){
                min = arr2[i];
            }
        }
        System.out.println(min);
    }

    @Override
    public void printName3(String name) {
        System.out.println("Interface 3 method, print name: " + name);
    }

    @Override
    public void printDate3() {
        Date d = new Date();
        System.out.println("Current day of the month: ");
        System.out.println(d.getDate());
    }

    @Override
    public void changeName2(String name) {
        System.out.println("IFaceTwo method, old name: " + this.name + " and a new name: " + name);
        this.name = name;
        System.out.println("new name :" + this.name);
    }

    @Override
    public void printTime2() {
        Date d = new Date();
        System.out.println(d.getTime());
    }

    public static void showIOneMax(IFaceOne iFaceOne, int[] array){
        System.out.println("With the interface one, for the array : " + Arrays.toString(array) + " we will receive: ");
        iFaceOne.maxNum1(array);
    }

    public static void ITwoName(IFaceTwo iFaceTwo, String name){
        System.out.println("Using interface two, by passing the String argument: " + name + " we will get: ");
        iFaceTwo.changeName2(name);
    }

    public static void IThreeDate(IFaceThree iFaceThree){
        System.out.println("Using interface 3 method, we can get in return: ");
        iFaceThree.printDate3();
    }

    public static void IChild(IFaceChild iFaceChild, String name){
        System.out.println("using the only method from the child interface, we will get: ");
        iFaceChild.electChild(name);
    }

    public static void main(String[] args) {
        Man Arnold = new Man("Arnold", 25);
        int[] arr = {1,2,3,4,8,9,0};

        showIOneMax(Arnold, arr);

        ITwoName(Arnold, "Victor");

        IThreeDate(Arnold);

        IChild(Arnold, "Gervais");
    }
}
