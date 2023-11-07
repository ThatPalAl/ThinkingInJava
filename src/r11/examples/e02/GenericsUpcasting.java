package r11.examples.e02;

import r11.examples.e01.Apple;

import java.util.ArrayList;

class GrannySmith extends Apple{

}
class Gala extends Apple{

}
class Fuji extends Apple{

}
class Braeburn extends Fuji{

}
public class GenericsUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple a : apples){
            System.out.println(a);
        }
    }
}
