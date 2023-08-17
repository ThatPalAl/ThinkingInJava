package r07.examples.e12;

public class Orc extends Villain {
    private int orcNr;

    public Orc(String name, int orcNr) {
        super(name);
        this.orcNr = orcNr;
    }

    public void change(String name, int orcName){
        setName(name);
        this.orcNr = orcName;
    }

    @Override
    public String toString() {
        return "Orc nr " +  orcNr + ": "+ super.toString();
    }
}
