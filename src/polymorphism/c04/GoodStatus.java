package polymorphism.c04;

public class GoodStatus extends Status {
    @Override
    public void alertStatus() {
        System.out.println("Everything is great, grab a beer and enjoy the journey");
    }
}
