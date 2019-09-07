package quizAplikacja;

public final class Wynik {
    private int punkty;
    private String imie;

    //TODO: Immutable, Mutable
    Wynik(int punkty, String imie) {
        this.punkty = punkty;
        this.imie = imie;
    }

    void setImie(String imie) {
        this.imie = imie;
    }

    public void dodajPunkt() {
        punkty++;
    }

    public int zwrocWszystkiePunkty() {
        return punkty;

    }

    String zwrocWszystkieImiona() {
        return imie;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return String.format("%s | %spkt", imie, punkty );
    }
}
