package r11.examples.e04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        for (Snow s: snow1) {
            System.out.println(s);
        }

        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        for (Snow s: snow2) {
            System.out.println(s);
        }

        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        for (Snow s: snow3) {
            System.out.println(s);
        }
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
        for (Snow s: snow4) {
            System.out.println(s);
        }
    }
}
