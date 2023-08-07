package r07.examples.e10;

public class Line extends Shape {
    private int start;
    private int end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing the line: " + start + " - > " + end);
    }

    @Override
    void Dispose() {
        System.out.println("Removing the line");
        super.Dispose();
    }
}
