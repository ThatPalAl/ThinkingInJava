package r07.examples.e12;

public class Villain {
    private String name;

    public Villain(String name) {
        this.name = name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hi, my name is " + name;
    }
}
