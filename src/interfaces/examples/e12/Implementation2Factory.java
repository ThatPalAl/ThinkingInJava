package interfaces.examples.e12;

public class Implementation2Factory implements ServiceFactory {
    public Implementation2Factory() {}

    @Override
    public Service getService() {
        return new Implementation2();
    }
}
