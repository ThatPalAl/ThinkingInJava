package r11.c18;

public class Word {
    String word;
    Integer counter;

    public Word(String word, Integer counter) {
        this.word = word;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "\n{" +
                "text='" + word + '\'' +
                ", counter=" + counter +
                '}';
    }
}
