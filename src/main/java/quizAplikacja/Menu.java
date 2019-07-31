package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;
import quizAplikacja.qa.PytanieIOdpowiedzDao;

class Menu {
    private Wejscie wejscie;

    Menu(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    void menuQuizu(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {
        new Komunikaty().wyswietlKomunikat("Wybierz pozycje z menu Quizu");
        Wyswietlacz.wyswietlacz();
        int menuId = wejscie.getIntInput();

        switch (menuId) {
            case (1):
                while (true) {
                    new WlaczenieQuizu(wejscie, new OdpowiedzUzytkownika(new PytanieIOdpowiedzDao(), wejscie)).wlacznieQuizu(pytanieIOdpowiedzDao.wezLosowe());
                break;
                }

            case (2):
                new Punktacja().tablicaWynikow();
                menuQuizu(pytanieIOdpowiedzDao);
                break;
            case (3):
                new QuizStop().zakonczenieDzialaniaAplikacji();
                break;
            default:
                new Komunikaty().wyswietlKomunikat("Nie wybrano żadnej opcji");
                menuQuizu(pytanieIOdpowiedzDao);
        }
    }


}
