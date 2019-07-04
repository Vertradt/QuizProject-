package quizAplikacja;

import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;

class WlaczenieQuizu {
    private static OdpowiedzUzytkownika odpowiedzUzytkownika;

     WlaczenieQuizu(OdpowiedzUzytkownika odpowiedzUzytkownika) {
        this.odpowiedzUzytkownika = odpowiedzUzytkownika;
    }

    void wlacznieQuizu(PytanieIOdpowiedz pytanieIOdpowiedz) {
        System.out.println("Quiz został uruchomiony");
        System.out.println(pytanieIOdpowiedz);
        odpowiedzUzytkownika.wprowadzanieOdpowiedzi();
    }

    @Override
    public String toString() {

        return 1 + " " + "WlaczenieQuizu";
    }
}
