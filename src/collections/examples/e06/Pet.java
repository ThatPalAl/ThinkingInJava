package collections.examples.e06;

public class Pet implements Comparable {

    private final int id;
    private static int next_id = 1;
    private final String name;

    public Pet(String name) {
        this.name = name;
        this.id = next_id++;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int id() {
        return id;
    }

}
