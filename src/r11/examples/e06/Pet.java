package r11.examples.e06;

import java.util.Comparator;

public class Pet implements Comparable {

    private int id;
    private static int next_id = 1;
    private String name;

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
