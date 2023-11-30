package exceptions.examples.e03;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;
import java.io.*;
public class LoggingException extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace =new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}
