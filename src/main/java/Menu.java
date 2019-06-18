import java.util.Scanner;

 class Menu {
    //TODO: Tutaj będzie wybranie opcja włączenia gry, 2 - wybór języka, 3 - punktacja, 4 - wyjście
//
//     private Scanner scanner;
//
//    Menu(Scanner scanner){
//        this.scanner = scanner;
//    }
    static void uruchom() {
        int menuId = Wejscie.getId();

        switch (menuId) {
            case (1):
                WlaczenieQuizu.wlacznieQuizu();
                break;
            case (2):
                WyborJezyka.wyborJezyka();
                break;
            case (3):
                Puntacja.tablicaWynikow();
                break;
            case (4):
                Stop.zakonczenieDzialaniaAplikacji();
                break;
        }
    }
}
