package r11.c06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple");
        Fruit orange = new Fruit("Orange");
        Fruit pineapple = new Fruit("Pineapple");
        Fruit mango = new Fruit("Mango");
        Fruit grape = new Fruit("Grape");
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(orange);
        fruits.add(pineapple);
        fruits.add(mango);
        fruits.add(grape);
        System.out.println(fruits);
        List<Fruit> fewFruits = fruits.subList(0,2);
        System.out.println(fewFruits);
        fruits.removeAll(fewFruits);
        System.out.println(fruits);

    }
}
