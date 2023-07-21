package R05.C11;

public class TriggerGC {
    TriggerGC() throws Throwable {
        finalize();
    }

    protected void finalize() throws Throwable {
        System.out.println("error occurred");
        super.finalize();
    }
}
