package r08.examples.e02;

public class Main {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i++){
            s[i] = gen.next();
            s[i].draw();
            s[i].amend();
        }

    }
}
