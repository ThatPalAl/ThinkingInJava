package collections.examples.e13;

import collections.examples.e06.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap =new HashMap<>();
        Pet Cat = new Pet("Cat");
        Pet Dog = new Pet("Dog");
        Pet Hamster = new Pet("Hamster");
        petMap.put("My cat", Cat);
        petMap.put("My dog", Dog);
        petMap.put("My hamster", Hamster);
        System.out.println(petMap);
        Pet Dog2 = petMap.get("My dog");
        System.out.println(Dog2);
        System.out.println(petMap.containsKey("My cat"));
        System.out.println(petMap.containsValue(Hamster));


    }
}
