package quizAplikacja.qa;

import quizAplikacja.Komunikaty;
import quizAplikacja.Wejscie;
import quizAplikacja.Zapytania;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;
    private PytanieIOdpowiedzDao pytanieIOdpowiedzDao;

    public OdpowiedzUzytkownika(PytanieIOdpowiedzDao pytanieIOdpowiedzDao, Wejscie wejscie) {
        this.pytanieIOdpowiedzDao = pytanieIOdpowiedzDao;
        this.wejscie = wejscie;
    }

    public void sprawdzenieOdpowiedzi(PytanieIOdpowiedz pytanieIOdpowiedz) {
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

        new Zapytania(wejscie, pytanieIOdpowiedzDao).wyswietelenieZapytan();

    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("OdpowiedzUzytkownika{");
//        sb.append("wejscie=").append(wejscie);
//        sb.append(", pytanieIOdpowiedzDao=").append(pytanieIOdpowiedzDao);
//        sb.append('}');
//        return sb.toString();
//    }
}