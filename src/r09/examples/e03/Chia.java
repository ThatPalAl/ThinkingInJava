package r09.examples.e03;

import r09.examples.e02.Seeds;

public class Chia implements Seeds {

    @Override
    public void chop() {
        System.out.println("Now, since the flavour has been exposed, why don't you use ti with some fried dish?");
    }

    @Override
    public void plant() {
        System.out.println("Now we are waiting for wonderful chia flower");
    }

    @Override
    public void save() {
        System.out.println("Use it for a yoghurt or any pudding you want, or just keep it as a decoration");
    }
}
