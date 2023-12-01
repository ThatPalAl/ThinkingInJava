package exceptions.c09;

import exceptions.c06.ExceptionOne;

public class Main {
    public static void main(String[] args) {
        gottaCatchThemAll(2);
    }

    static void gottaCatchThemAll(int val){
        try{
            switch (val){
                case 1:{
                    throw new ExceptionNrOne();
                }
                case 2:{
                    throw new ExceptionNrTwo();
                }
                case 3:{
                    throw new ExceptionNrThree();
                }
            }
        } catch (ExceptionNrOne e1){
            System.out.println(e1.getClass().getSimpleName());
        } catch (ExceptionNrTwo e2) {
            System.out.println(e2.getClass().getSimpleName());
        } catch (ExceptionNrThree e3){
            System.out.println(e3.getClass().getSimpleName());
        } finally {
            System.out.println("You have caught at least one of them, right?");
        }
    }
}
