package r05.C11;

public class Main {
    public static void main(String[] args) throws Throwable {
        TriggerGC triggerGC1 = new TriggerGC();
        TriggerGC triggerGC2 = new TriggerGC();
        triggerGC1.finalize();
        triggerGC2.finalize();
    }
}
