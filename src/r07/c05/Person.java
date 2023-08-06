package r07.c05;

public class Person {
    int age;
    public Person(int age) {
        this.age = age;
        System.out.println("Person's age : " + age);

    }

    @Override
    public String toString() {
        return this.toString() + " ";
    }
}
