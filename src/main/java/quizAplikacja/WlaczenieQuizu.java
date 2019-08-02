package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;

class WlaczenieQuizu {
    private Wejscie wejscie;
    private OdpowiedzUzytkownika odpowiedzUzytkownika;

    WlaczenieQuizu(Wejscie wejscie, OdpowiedzUzytkownika odpowiedzUzytkownika) {
        this.wejscie = wejscie;
        this.odpowiedzUzytkownika = odpowiedzUzytkownika;
    }

    void uruchomQuiz(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {
        wejscie.getStringInput();
        boolean rezultat;
        do {
            Wyswietlacz.losowePytanie(pytanieIOdpowiedzDao.wezLosowe());
            Wyswietlacz.komunikat("Czy wiedziałeś o tym?");
            rezultat = odpowiedzUzytkownika.sprawdzenieOdpowiedzi();
        } while (rezultat);
    }


    @Override
    public String toString() {

        return 1 + " " + "WlaczenieQuizu";
    }
}
