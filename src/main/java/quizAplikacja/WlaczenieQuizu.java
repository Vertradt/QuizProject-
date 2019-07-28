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
            odpowiedzUzytkownika.sprawdzenieOdpowiedzi();
                System.out.println("Czy chcesz grać dalej?");
                if (wejscie.getStringInput().equals("tak")) {
                    odpowiedzUzytkownika.sprawdzenieOdpowiedzi();

                }
             else{
                System.out.println("Powrót do menu");
                   break;
            }
        }
    }
//            new LicznikPunktow(new OdpowiedzUzytkownika(pytanieIOdpowiedz, wejscie)).punkty();
//        }


    @Override
    public String toString() {

        return 1 + " " + "WlaczenieQuizu";
    }
}
