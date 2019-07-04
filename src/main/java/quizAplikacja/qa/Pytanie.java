package quizAplikacja.qa;

public class Pytanie {
    private String tresc;

    public Pytanie(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public String toString() {
        return tresc;
    }
}
