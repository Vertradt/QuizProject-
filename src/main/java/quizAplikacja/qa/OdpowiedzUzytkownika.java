package quizAplikacja.qa;

import quizAplikacja.Komunikaty;
import quizAplikacja.Wejscie;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;

    public OdpowiedzUzytkownika(Wejscie wejscie) {
        this.wejscie = wejscie;

    }

    public void sprawdzenieOdpowiedzi() {
        new Komunikaty().wyswietlKomunikat("Czy wiedziałeś o tym?");
        String odpowiedz = wejscie.getStringInput();
        String odpowiedzPoprawna = "tak";
        String odpowiedzNiepoprawna = "nie";

        boolean porownanieDlaPoprawnej = odpowiedz.equals(odpowiedzPoprawna);
        boolean porownianieDlaNiepoprawnej = odpowiedz.equals(odpowiedzNiepoprawna);

        if (porownanieDlaPoprawnej) new Komunikaty().wyswietlKomunikat("Poprawna odpowiedź");
        else if (!porownianieDlaNiepoprawnej) {
            new Komunikaty().wyswietlKomunikat("Poprawna odpowiedź");
        } else {
            new Komunikaty().wyswietlKomunikat("Zła odpowiedź. Czy chcesz grać dalej?");
        }


    }
}
