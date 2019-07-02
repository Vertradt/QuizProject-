import qa.Dao;
import qa.PytanieIOdpowiedz;

class Menu {
    private Wejscie wejscie;

    public Menu(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    void menuQuizu(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {
        Komunikaty.wyswietlKomunikat("Wybierz pozycje z menu Quizu");
        Wyswietlacz.wyświetlacz();
        int menuId = wejscie.getInput();

        switch (menuId) {
            case (1):
                new WlaczenieQuizu().wlacznieQuizu(pytanieIOdpowiedzDao.weźLosowe());
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
                Komunikaty.wyswietlKomunikat("Nie wybrano żadnej opcji");
                menuQuizu(pytanieIOdpowiedzDao);
        }
    }
}
