package reusingClasses.c05;

public class Child {
    int age = 7;
    String school = "primary";

    public Child(int age, String school) {
        Person person1 = new Person(this.age);
        this.age = age;
        this.school = school;
        Person person2 = new Person(this.age);
        Person person3 = new Person(age);
        new Person(age);
        System.out.println("Child's age: " + age + " and the school is: " + school);
    }

    public Child() {
        Person person1 = new Person(this.age);
        Person person2 = new Person(age);
        System.out.println("Child's age: " + age + " and the school: " + school);
    }
}
