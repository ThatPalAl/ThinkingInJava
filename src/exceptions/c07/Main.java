package exceptions.c07;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger("Ex7 exception logging");
    private static int[] array = {1,2,3};

    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            int val = array[3];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException ");
            e.printStackTrace();
            logException(e);
        }
    }
}
