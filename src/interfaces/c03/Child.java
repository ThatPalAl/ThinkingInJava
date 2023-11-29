package interfaces.c03;

public class Child extends Human {
    private int age = 330;

    public Child(int age) {
        this.age = age;
        introduction();
    }

    @Override
    void introduction() {
        System.out.println("I am a kid and I am " + age);
    }
}
