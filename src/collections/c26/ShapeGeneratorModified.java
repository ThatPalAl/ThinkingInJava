package collections.c26;

import polymorphism.examples.e02.*;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ShapeGeneratorModified implements Iterable<Shape>{

    private Random random = new Random(47);

    public Shape make(){
        return switch (random.nextInt(3)) {
            case 1 -> new Circle();
            case 2 -> new Square();
            case 3 -> new Triangle();
            default -> new Triangle();
        };
    }
    private Shape[] shapes;
    public ShapeGeneratorModified(int amount) {
        shapes = new Shape[amount];
        for(int i = 0; i < amount; i++){
            shapes[i] = make();
        }

    }

    public Iterator<Shape> iterator(){
        return new Iterator<Shape>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Shape> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Shape> spliterator() {
        return Iterable.super.spliterator();
    }

    public static void main(String[] args) {
            ShapeGeneratorModified sg = new ShapeGeneratorModified(12);
            for(Shape s : sg){
                s.draw();
            }
    }
}
