import qa.Dao;
import qa.PytanieIOdpowiedz;

import java.util.Scanner;

class Quiz {

    private Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao;

    public Quiz(Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao) {

        this.pytanieIOdpowiedzDao = pytanieIOdpowiedzDao;
    }

    void start() {
        new Menu(new Wejscie(new Scanner(System.in))).menuQuizu(pytanieIOdpowiedzDao);
    }
}
