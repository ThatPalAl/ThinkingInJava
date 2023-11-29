package reusingClasses.examples.e10;

public class Main {
    public static void main(String[] args) {
        CADSystem cadSystem = new CADSystem(47);
        try {

        }
        finally {
            cadSystem.Dispose();
        }

    }
}
