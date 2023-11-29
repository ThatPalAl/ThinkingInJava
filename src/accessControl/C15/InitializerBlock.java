package accessControl.C15;

public class InitializerBlock {
    String value;
    {
        value = "text";
    }

    public InitializerBlock() {
        System.out.println(value);
    }
}
