package quizAplikacja;

import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;

class WlaczenieQuizu {
    private Wejscie wejscie;

    WlaczenieQuizu(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    void wlacznieQuizu(PytanieIOdpowiedz pytanieIOdpowiedz) {
        wejscie.getStringInput(); //TODO: Zostawiłem tutaj ten input i dodałem poniżej pętle, wcześniej była
                                  // umieszczona bezpośrednio w klasie Menu, w pierwszyma casie. Nie wiem czy to dobre rozwiąznie
        while (true) {
            new OdpowiedzUzytkownika(pytanieIOdpowiedz, wejscie).sprawdzenieOdpowiedzi(pytanieIOdpowiedz);
            new LicznikPunktow(new OdpowiedzUzytkownika(pytanieIOdpowiedz, wejscie)).punkty();
        }
    }

    @Override
    public String toString() {

        return 1 + " " + "WlaczenieQuizu";
    }
}
