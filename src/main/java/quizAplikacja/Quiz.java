package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.PytanieIOdpowiedz;

import java.util.Scanner;

class Quiz {

    private Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao;

    Quiz(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {

        this.pytanieIOdpowiedzDao = pytanieIOdpowiedzDao;
    }

    void start() {
        new Menu(new Wejscie(new Scanner(System.in)), new Punktacja()).uruchom(pytanieIOdpowiedzDao);
    }
}
