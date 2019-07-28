package quizAplikacja.qa;

import quizAplikacja.Komunikaty;
import quizAplikacja.Wejscie;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;
    private PytanieIOdpowiedzDao pytanieIOdpowiedzDao;

    public OdpowiedzUzytkownika(PytanieIOdpowiedzDao pytanieIOdpowiedzDao, Wejscie wejscie) {
        this.pytanieIOdpowiedzDao = pytanieIOdpowiedzDao;
        this.wejscie = wejscie;
    }

    public void sprawdzenieOdpowiedzi() {
        System.out.println(pytanieIOdpowiedzDao.wezLosowe());
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