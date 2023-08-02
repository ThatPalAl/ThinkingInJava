package r05.Examples.E16;

public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public Spiciness getDegree() {
        return degree;
    }

    public void describe(){
        switch (degree){
            case NOT -> {
                System.out.println("No spicies at all");
            }
            case MILD -> {
                System.out.println("Contain a litlle bit of cayenne pepper.");
            }
            case MEDIUM -> {
                System.out.println("Chili flakes included, just for a test");
            }
            case HOT -> {
                System.out.println("You will find fresh jalapeno peppers inside.");
            }
            case FLAMING -> {
                System.out.println("Do not try this at home! It contains the wildest spices we discovered");
            }
            default -> {
                System.out.println("The spiciness degree was not picked.");
            }
        }

    }
}
