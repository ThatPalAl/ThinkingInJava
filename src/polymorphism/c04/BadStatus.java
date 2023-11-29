package polymorphism.c04;

public class BadStatus extends Status {
    @Override
    public void alertStatus() {
        System.out.println("Starship needs attention, Houston we've got a problem");
    }
}
