class Menu {
    //TODO: Tutaj będzie wybranie opcja włączenia gry, 2 - wybór języka, 3 - punktacja, 4 - wyjście
//
//     private Scanner scanner;
//
//    Menu(Scanner scanner){
//        this.scanner = scanner;
//    }
    static void menuQuizu() {
        int menuId = Wejscie.getId();

        switch (menuId) {
            case (1):
                WlaczenieQuizu.wlacznieQuizu();
                menuQuizu();
                break;
            case (2):
                WyborJezyka.wyborJezyka();
                menuQuizu();
                break;
            case (3):
                Puntacja.tablicaWynikow();
                menuQuizu();
                break;
            case (4):
                QuizStop.zakonczenieDzialaniaAplikacji();
                menuQuizu();
                break;
            default:
                System.out.println("Nie wybrano żadnej opcji");
                menuQuizu();
        }
    }
}
