package r09.c03;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human(); cannot initialize abstract class
        Human waltNovitzki = new Father(12, "Walt");
        Human tomCruise = new Father(20, "Tom");
        Child child = new Child(23);
    }
}
