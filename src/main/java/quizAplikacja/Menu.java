package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.OdpowiedzUzytkownika;
import quizAplikacja.qa.PytanieIOdpowiedz;

class Menu {
    private static final int WLACZENIE_QUIZU = 1;
    private static final int PUNKTACJA = 2;
    private static final int WYLACZENIE_QUIZU = 3;


    private Wejscie wejscie;
    private Punktacja punktacja;

    Menu(Wejscie wejscie, Punktacja punktacja) {
        this.wejscie = wejscie;
        this.punktacja = punktacja;
    }

    void uruchom(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {
        new Komunikaty().wyswietlKomunikat("Wybierz pozycje z menu Quizu");
        Wyswietlacz.menu();
        int menuId = wejscie.getIntInput();

        switch (menuId) {
            case WLACZENIE_QUIZU:
                OdpowiedzUzytkownika odpowiedzUzytkownika = new OdpowiedzUzytkownika(wejscie);
                WlaczenieQuizu wlaczenieQuizu = new WlaczenieQuizu(wejscie, odpowiedzUzytkownika, punktacja);
                wlaczenieQuizu.uruchomQuiz(pytanieIOdpowiedzDao);
                uruchom(pytanieIOdpowiedzDao);
                break;
            case PUNKTACJA:
                Wyswietlacz.wyswietlanieTablicyWynikow(punktacja.zwrocWyniki());

                uruchom(pytanieIOdpowiedzDao);
                break;
            case WYLACZENIE_QUIZU:
                new QuizStop().zakonczenieDzialaniaAplikacji();
                new KonwersjeJson(punktacja).konwertujDoJson();
                break;
            default:
                new Komunikaty().wyswietlKomunikat("Nie wybrano żadnej opcji");
                uruchom(pytanieIOdpowiedzDao);
        }
    }


}
