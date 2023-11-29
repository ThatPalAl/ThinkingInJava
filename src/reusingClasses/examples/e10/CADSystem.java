package reusingClasses.examples.e10;

public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i);
        c = new Circle(1);
        t = new Triangle(1);
        for(int j = 0; j < lines.length; j++){
            lines[j] = new Line(j, j * j);
        }
        System.out.println("Combined Constructor");
    }

    @Override
    void Dispose() {
        System.out.println("removing CAD");
        c.Dispose();
        t.Dispose();
        for(int i = 0; i < lines.length; i++){
            lines[i].Dispose();
        }
        super.Dispose();
    }
}
