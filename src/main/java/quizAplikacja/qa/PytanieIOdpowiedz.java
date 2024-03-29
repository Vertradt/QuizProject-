package quizAplikacja.qa;

public class PytanieIOdpowiedz {

    private int id;
    private Pytanie pytanie;
    private Odpowiedz odpowiedź;

    public PytanieIOdpowiedz(int id, Pytanie pytanie, Odpowiedz odpowiedź) {
        this.id = id;
        this.pytanie = pytanie;
        this.odpowiedź = odpowiedź;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(",").append(pytanie);
        sb.append(",").append(odpowiedź);
        return sb.toString();
    }
}
