package quizAplikacja.qa;

import quizAplikacja.SprawdzaczWejscia;
import quizAplikacja.Wejscie;
import quizAplikacja.ZagrajPonowniePytacz;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;

    public OdpowiedzUzytkownika(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    public boolean sprawdzenieOdpowiedzi() {
        new SprawdzaczWejscia(wejscie).waliduj("Poprawna odpowiedź", "Niepoprawna odpowiedź");
        boolean czyGracDalej = new ZagrajPonowniePytacz(wejscie).zapytaj();
        return czyGracDalej;
    }
}