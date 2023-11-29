package reusingClasses.examples.e08;

public class CleaningPerson {
    private String name;
    Detergent detergent = new Detergent();

    public CleaningPerson(String name) {
        this.name = name;
    }

    public void append(String a) {
        detergent.append(a);
    }

    public void dilute() {
        detergent.dilute();
    }

    public void apply() {
        detergent.apply();
    }

    public void scrub() {
        detergent.scrub();
    }

    public void foam() {
        detergent.foam();
    }

    public static void main(String[] args) {
        CleaningPerson cleaningPerson = new CleaningPerson("Maria");
        cleaningPerson.scrub();
    }
}
