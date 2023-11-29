package accessControl.Examples.E02;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Apple apple = new Apple();
        person.eat(apple);

        new Person().eat(new Apple());
    }
}
