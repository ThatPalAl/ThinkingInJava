package interfaces.c03;

public class Father extends Human {
    private int age;
    private String name;

    public Father(int age, String name) {
        this.age = age;
        this.name = name;
        introduction();
    }

    public void updateAge(int age) {
        this.age = age;
    }

    @Override
    void introduction() {
        System.out.println("My name is " + name + " and I am " + age);
    }
}
