package R05.C12;

public class Main {
    public static void main(String[] args) throws Throwable {
        Tank tank1 = new Tank(false);
        Tank tank2 = new Tank(false);
        Tank tank3 = new Tank(true);


        System.out.println("Tank 1 status " + tank1.filled);
        tank1.fill();
        tank1.fill();
        tank1.empty();
        tank1.empty();

        System.out.println("\nTank 2 action: " + tank2.filled);
        tank2.fill(tank2.filled);
        tank2.fill(tank2.filled);
        tank2.empty(tank2.filled);
        tank2.empty(tank2.filled);
        tank2.fill(tank2.filled);
        tank2.finalize();

        System.out.println("\nTank 3 operations: " + tank3.filled);
        tank3.fill(tank3.filled);
        tank3.fill(tank3.filled);
        tank3.empty(tank3.filled);
        tank3.fill(tank3.filled);
        tank3.fill(tank3.filled);
        tank3.empty(tank3.filled);
        tank3.empty(tank3.filled);
        tank3.finalize();

    }
}
