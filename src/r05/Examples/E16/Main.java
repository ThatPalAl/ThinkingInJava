package r05.Examples.E16;

public class Main {
    public static void main(String[] args) {
        Spiciness spiciness = Spiciness.HOT;
        System.out.println(spiciness);

        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ", placed at: " + s.ordinal());
            if(s.ordinal() % 2 == 0 && s.ordinal() != 0){
                System.out.println("divided by 2");
            }
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Burritos spiciness degrees: ");
        Burrito easyPeasy = new Burrito(Spiciness.NOT);
        Burrito madridTraditional = new Burrito(Spiciness.MILD);
        Burrito catalonanPlantBeef = new Burrito(Spiciness.MEDIUM);
        Burrito africanSensation = new Burrito(Spiciness.HOT);
        Burrito mexicanSpecialty = new Burrito(Spiciness.FLAMING);
        Burrito[] burritos = {easyPeasy, madridTraditional, catalonanPlantBeef, africanSensation, mexicanSpecialty};
        for(Burrito b: burritos){
            System.out.println(b.getDegree());
            b.describe();
        }

    }
}
