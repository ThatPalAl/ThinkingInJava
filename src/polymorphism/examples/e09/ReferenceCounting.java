package polymorphism.examples.e09;

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared), new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)
        };

        for(Composing c : composings){
            System.out.println(c);
        }

        for(Composing c : composings){
            c.dispose();
        }
    }
}
