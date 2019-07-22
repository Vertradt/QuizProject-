package quizAplikacja.qa;

import quizAplikacja.Komunikaty;
import quizAplikacja.Wejscie;

public class OdpowiedzUzytkownika {
    private PytanieIOdpowiedz pytanieIOdpowiedz;
    private Wejscie wejscie;

    public OdpowiedzUzytkownika(PytanieIOdpowiedz pytanieIOdpowiedz, Wejscie wejscie) {
        this.pytanieIOdpowiedz = pytanieIOdpowiedz;
        this.wejscie = wejscie;
    }

    public void sprawdzenieOdpowiedzi(PytanieIOdpowiedz pytanieIOdpowiedz) {
        System.out.println(pytanieIOdpowiedz);
        new Komunikaty().wyswietlKomunikat("Czy wiedziałeś o tym?");
        String odpowiedz = wejscie.getStringInput();
        if (odpowiedz.equals("tak")) {
            new Komunikaty().wyswietlKomunikat("Poprawna odpowiedź");
        } else if (odpowiedz.equals("nie")) {
            new Komunikaty().wyswietlKomunikat("Błędna odpowiedź");
        } else {
            new Komunikaty().wyswietlKomunikat("Zła odpowiedź. Wprowadź 'tak' lub 'nie'");
        }
    }
}