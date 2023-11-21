package r11.examples.e13;

import r07.c05.Person;
import r11.examples.e06.Pet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedContainers {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
    static{
        petPeople.put(new Person("Tom"), Arrays.asList(new Pet("Mutt"), new Pet("Spot")));
        petPeople.put(new Person("Katie"),
                Arrays.asList(new Pet("Cat"), new Pet("Dog"), new Pet("Hamster")));
        petPeople.put(new Person("Marie"),
                Arrays.asList(new Pet("Snake"), new Pet("Crocco"), new Pet("Horse")));
        petPeople.put(new Person("Lucy"),Arrays.asList(new Pet("Rat"), new Pet("Mouse")));
        petPeople.put(new Person("Jacob"), List.of(new Pet("Rat")));
        petPeople.put(new Person("John"), List.of());
//        petPeople.clear();
    }

    public static void main(String[] args) {
        System.out.println(petPeople);
        System.out.println("People: " + petPeople.keySet());
        System.out.println("---------------------------");
        System.out.println("Pets: " + petPeople.values());
        for(Person person : petPeople.keySet()){
            System.out.println(person.toString() + " has: ");
            for(Pet pet : petPeople.get(person)){
                System.out.println("  " + pet);
            }
        }
    }

}
