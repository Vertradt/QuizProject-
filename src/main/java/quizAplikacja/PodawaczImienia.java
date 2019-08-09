package quizAplikacja;

class PodawaczImienia {
    private Wejscie wejscie;
    private Wynik wynik;

    PodawaczImienia(Wejscie wejscie, Wynik wynik) {
        this.wejscie = wejscie;
        this.wynik = wynik;
    }

    void podajImie() {
        Wyswietlacz.komunikat("Podaj swoje imię");
        wynik.setImie(wejscie.getStringInput());
    }
}
