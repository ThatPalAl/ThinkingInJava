package R05.C19;

public class Main {
    public static void main(String[] args) {
        for(Banknotes banknote : Banknotes.values()) {
            System.out.println((banknote.ordinal() + 1) + ":" + banknote);
            switch (banknote){
                case TEN -> System.out.println("Enough for a water and a snack");
                case TWENTY -> System.out.println("Buy yourself some cigarettes");
                case FIFTY -> System.out.println("Proper evening starter pack");
                case ONE_HUNDRED -> System.out.println("Save at least 10% percent of it, just for sake");
                case TWO_HUNDRED -> System.out.println("Enough for a fancy dinner");
            }
        }

    }
}
