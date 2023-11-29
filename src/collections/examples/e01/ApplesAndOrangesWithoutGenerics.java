package collections.examples.e01;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();;
        for(int i = 0; i < 3; i++){
            apples.add(new Apple()); //unprotected from combining Apple with Orange
        }
        apples.add(new Orange());
//        apples.add("w");
        for(int i = 0; i < apples.size(); i++){
            System.out.println(apples.indexOf(i));
            ((Apple) apples.get(i)).id(); // The not apple object occurrence (Orange) is detected during program exec.
                        // NOT DURING COMPILATION - that's because we didn't specify the container type
        }
    }
}
