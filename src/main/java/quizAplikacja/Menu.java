package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;

class Menu {
    private static final int WLACZENIE_QUIZU = 1;
    private static final int PUNKTACJA = 2;
    private static final int WYLACZENIE_QUIZU = 3;


    private Wejscie wejscie;

    Menu(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    void uruchom(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {
        new Komunikaty().wyswietlKomunikat("Wybierz pozycje z menu Quizu");
        Wyswietlacz.menu();
        int menuId = wejscie.getIntInput();

        switch (menuId) {
            case WLACZENIE_QUIZU:
                while (true) {
                    OdpowiedzUzytkownika odpowiedzUzytkownika = new OdpowiedzUzytkownika(wejscie);
                    WlaczenieQuizu wlaczenieQuizu = new WlaczenieQuizu(wejscie, odpowiedzUzytkownika);
                    wlaczenieQuizu.uruchomQuiz(pytanieIOdpowiedzDao);
                    uruchom(pytanieIOdpowiedzDao);
                    break;
                }
                break;
            case PUNKTACJA:
                new Punktacja().tablicaWynikow();
                uruchom(pytanieIOdpowiedzDao);
                break;
            case WYLACZENIE_QUIZU:
                new QuizStop().zakonczenieDzialaniaAplikacji();
                break;
            default:
                new Komunikaty().wyswietlKomunikat("Nie wybrano żadnej opcji");
                uruchom(pytanieIOdpowiedzDao);
        }
    }


}
