package r05.C09;

public class ThisConstr {
    String val0;
    int digit0;
    ThisConstr(String val1){
        this.val0 = val1;
    }
    ThisConstr(String val2, int digit1) {
        this("text");
        this.digit0 = digit1;
    }
    ThisConstr(int digit2, String val3){
        this.digit0 = digit2;
        this.val0 = val3;
    }

    public String toString1() {
        return "ThisConstr{" +
                "val0='" + val0 + '\'' +
                '}';
    }

    public String toString2() {
        return "ThisConstr{" +
                "val0='" + val0 + '\'' +
                ", digit0=" + digit0 +
                '}';
    }
}
