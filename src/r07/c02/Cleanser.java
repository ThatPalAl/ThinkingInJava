package r07.c02;

public class Cleanser {
    private String s;
//    static String s1;

    //Default constructor would be created anyway.
    public Cleanser() {
    }

    public void append(String a){
        s += a;
    }

    public void dilute(){
        append(" dilute()");
    }

    public void apply(){
        append(" apply()");
    }

    public void scrub(){
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
//        System.out.println(cleanser);
        cleanser.scrub();
        System.out.println(cleanser);
//        cleanser.s = "new value";
//        System.out.println(cleanser);
    }
}
