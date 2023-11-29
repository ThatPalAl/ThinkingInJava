package accessControl.Examples.E01;

public class Leaf {
    int i = 0;
    Leaf returnObject (int i){
        this.i = i;
        print();
        return this;
    }
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }
}
