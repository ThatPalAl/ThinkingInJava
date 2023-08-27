package r08.c04;

public class Starship {
    private Status status = new NormalStatus();
    public void changeStatusToGood(){
        status = new GoodStatus();
    }

    public void changeStatusToBad(){
        status = new BadStatus();
    }

    public void changeStatusToNeutral(){
        status = new NormalStatus();
    }

    public void showStatus(){
        status.alertStatus();
    }
}
