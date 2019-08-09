package quizAplikacja;

public final class Wynik {
    private int punkty;
    private String imie;

    //TODO: Immutable, Mutable
    Wynik(int punkty, String imie) {
        this.punkty = punkty;
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    //TODO: nadaj imie podajImie i do imienia muszę nadać (setImie)
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void dodajPunkt() {
        punkty++;
    }

    public int zwrocWszystkiePunkty() {
        return punkty;

    }

    public String zwrocWszystkieImiona() {
        return imie;
    }

}
