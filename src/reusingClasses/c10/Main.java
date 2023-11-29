package reusingClasses.c10;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.sound();
        Frog.wildSound();
        Lizard lizard = new Lizard();
        lizard.sound();
        Lizard.wildSound();

    }
}
