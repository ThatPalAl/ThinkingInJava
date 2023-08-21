package r07.c11;

public class Main {
    public static void main(String[] args) {
        Root root = new Root();
        //not a single custom method available
        Tree tree = new Tree();
        tree.s();
        tree.t();
        Leaf leaf = new Leaf();
        leaf.s();
        leaf.t();
        //Leaf can only override the NOT FINAL method but it's still able to use the t() method from the parent class.
    }
}
