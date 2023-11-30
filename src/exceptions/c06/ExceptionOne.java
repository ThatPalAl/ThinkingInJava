package exceptions.c06;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

public class ExceptionOne extends Exception {
    private static Logger logger = Logger.getLogger("Whatever");
    String message;
    public ExceptionOne(String message){
        this.message = message;
        System.out.println("New Exception created with message: " + message);
        log();
    }

    public void log()  {
        System.out.println(message);
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
