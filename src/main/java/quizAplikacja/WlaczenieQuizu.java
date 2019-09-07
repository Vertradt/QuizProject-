package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;

class WlaczenieQuizu {
    private Wejscie wejscie;
    private OdpowiedzUzytkownika odpowiedzUzytkownika;
    private Punktacja punktacja;

    WlaczenieQuizu(Wejscie wejscie, OdpowiedzUzytkownika odpowiedzUzytkownika, Punktacja punktacja) {
        this.wejscie = wejscie;
        this.odpowiedzUzytkownika = odpowiedzUzytkownika;
        this.punktacja = punktacja;
    }

    void uruchomQuiz(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {
        wejscie.getStringInput();
        boolean rezultat;
        Wynik wynik = new Wynik(0, null);

        do {
            Wyswietlacz.losowePytanie(pytanieIOdpowiedzDao.wezLosowe());
            Wyswietlacz.komunikat("Czy wiedziałeś o tym?");
            rezultat = odpowiedzUzytkownika.sprawdzenieOdpowiedzi(wynik);
        } while (rezultat);

        Wyswietlacz.komunikat("Podaj swoje imię");
        wynik.setImie(wejscie.getStringInput());
        Wyswietlacz.wyswietlenieImieniaIPunktow(wynik.zwrocWszystkieImiona(),wynik.zwrocWszystkiePunkty());

        punktacja.dodajWynik(wynik);


    }


    @Override
    public String toString() {

        return 1 + " " + "WlaczenieQuizu";
    }
}
