package quizAplikacja;

import quizAplikacja.qa.PytanieIOdpowiedzDao;

public class Zapytania {
    private Wejscie wejscie;
    private PytanieIOdpowiedzDao pytanieIOdpowiedzDao;

    public Zapytania(Wejscie wejscie, PytanieIOdpowiedzDao pytanieIOdpowiedzDao) {
        this.wejscie = wejscie;
        this.pytanieIOdpowiedzDao = pytanieIOdpowiedzDao;
    }


    public void wyswietelenieZapytan() {

        System.out.println("Czy chcesz grać dalej?");
        if (wejscie.getStringInput().equals("tak")) {
            new PytanieIOdpowiedzDao().wezLosowe();
        } else {
            System.out.println("Powrót do menu");
                new Menu(wejscie).menuQuizu(new PytanieIOdpowiedzDao());
        }
    }
}
