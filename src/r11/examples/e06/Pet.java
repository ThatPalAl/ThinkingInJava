package r11.examples.e06;

import java.util.Comparator;

public class Pet implements Comparable {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
