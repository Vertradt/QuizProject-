package quizAplikacja.qa;

import quizAplikacja.Wejscie;
import quizAplikacja.Wyswietlacz;
import quizAplikacja.ZagrajPonowniePytacz;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;

    public OdpowiedzUzytkownika(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    public boolean sprawdzenieOdpowiedzi() {
        String odpowiedz = wejscie.getStringInput();
        switch (odpowiedz) {
            case "tak":
                Wyswietlacz.komunikat("Poprawna odpowiedź");
                break;
            case "nie":
                Wyswietlacz.komunikat("Błędna odpowiedź");
                break;
            default:
                Wyswietlacz.komunikat("Zła odpowiedź. Wprowadź \"tak\" lub \"nie\"");

        }
        boolean czyGracDalej = new ZagrajPonowniePytacz(wejscie).zapytaj();
        return czyGracDalej;
    }
}