package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.PytanieIOdpowiedz;

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
                new WlaczenieQuizu(wejscie).wlacznieQuizu(pytanieIOdpowiedzDao.wezLosowe());
                menuQuizu(pytanieIOdpowiedzDao);
                break;
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
