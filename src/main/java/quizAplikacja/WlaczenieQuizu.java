package quizAplikacja;

import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;

class WlaczenieQuizu {
    private Wejscie wejscie;
    private OdpowiedzUzytkownika odpowiedzUzytkownika;

    WlaczenieQuizu(Wejscie wejscie, OdpowiedzUzytkownika odpowiedzUzytkownika) {
        this.wejscie = wejscie;
        this.odpowiedzUzytkownika = odpowiedzUzytkownika;
    }

    void wlacznieQuizu(PytanieIOdpowiedz pytanieIOdpowiedz) {
        wejscie.getStringInput();
        while (true) {
            odpowiedzUzytkownika.sprawdzenieOdpowiedzi(pytanieIOdpowiedz);
        }
    }
//            new LicznikPunktow(new OdpowiedzUzytkownika(pytanieIOdpowiedz, wejscie)).punkty();
//        }


    @Override
    public String toString() {

        return 1 + " " + "WlaczenieQuizu";
    }
}
