package R05.C02;

public class ConstrComponent {
    String ConstComp;

    ConstrComponent(String constComp){
        this.ConstComp = constComp;
        System.out.println(constComp);
    }

    @Override
    public String toString() {
        return "ConstComp='" + ConstComp;
    }
}
