package r08.examples.e12;

public class Stage {
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }

    public void performPlay(){
        actor.act();
    }

}
