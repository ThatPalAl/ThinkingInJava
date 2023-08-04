package r07.examples.e02;

public class Bath {
    private String
        s1 = "happy",
        s2 = "happy",
        s3,s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("inside Bath()");
        s3 = "overwhelmed";
        toy = 3.14f;
        castille = new Soap();
    }
    {
        System.out.println("...");
        System.out.println(s4);
        i = 46;
    }

    @Override
    public String toString() {
        if(s4 == null){
            s4 = "overwhelmed";
        }
        return
                "s1 = " + s1 +
                        "\n s2 = " + s2 +
                        "\n s3 = " + s3 +
                        "\n s4 = " + s4 +
                        "\n i = " + i +
                        "\n toy = " + toy +
                        "\n castille = " + castille;
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }
}
