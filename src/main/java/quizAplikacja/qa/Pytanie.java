package quizAplikacja.qa;

public class Pytanie {
    private String tresc;

     Pytanie(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public String toString() {
        return tresc;
    }
}
