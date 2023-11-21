package r07.c05;

public class Person {
    int age;
    String name;
    public Person(int age) {
        this.age = age;
        System.out.println("Person's age : " + age);

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }
}
