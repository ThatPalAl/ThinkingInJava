package r11.examples.e16;

import r11.examples.e06.Pet;

import java.util.*;

import static r11.examples.e09.ListIteration.addPets;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it){
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets){
        for(Pet p : pets){
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pet dog = new Pet("Dog");
        Pet cat = new Pet("Cat");
        Pet mouse = new Pet("Mouse");
        Pet rabbit = new Pet("Rabbit");
        Pet gorilla = new Pet("Gorilla");
        Pet shark = new Pet("Shark");
        Pet elephant = new Pet("Elephant");
        Pet hamster = new Pet("Hamster");
        Pet pigeon = new Pet("Pigeon");

        List<Pet> petList = new ArrayList<>(8);
        addPets(petList, dog, cat, mouse, rabbit, gorilla, shark, elephant, hamster, pigeon);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String,Pet> petMap = new LinkedHashMap<>();
        String[]names = ("John, Eric, George, Robin, Lucy, Ann, Bart, Frank").split(",");
        for(int i = 0; i < names.length; i++){
            petMap.put(names[i], petList.get(i));
        }
        System.out.println(petList.get(3));
        System.out.println("Display petList:");
        display(petList);
        System.out.println("Display petSet:");
        display(petSet);
        System.out.println("Display petList.iterator():");
        display(petList.iterator());
        System.out.println("Display petSet.iterator():");
        display(petSet.iterator());
        System.out.println("sout petMap:");
        System.out.println(petMap);
        System.out.println("sout petMap.keySet():");
        System.out.println(petMap.keySet());
        System.out.println("display petmap.values():");
        display(petMap.values());
        System.out.println("display petMap.values().iterator():");
        display(petMap.values().iterator());


    }
}
