package interfaces.c04;

public class Tree extends Root {

    public void me(){
        System.out.println("Tree is me");
    };

    public void meBotNotTheSame(Root r){
        r = new Tree();
        ((Tree) r).me();
    }
}
