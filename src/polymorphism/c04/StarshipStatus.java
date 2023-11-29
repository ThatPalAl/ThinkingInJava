package polymorphism.c04;

public class StarshipStatus {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.showStatus();
        starship.changeStatusToBad();
        starship.showStatus();
        starship.changeStatusToGood();
        starship.showStatus();
        starship.changeStatusToNeutral();
        starship.showStatus();
    }
}
