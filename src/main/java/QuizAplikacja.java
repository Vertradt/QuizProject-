import qa.*;

import java.util.List;

public class QuizAplikacja {

    public static void main(String[] args) {
        Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao = new PytanieIOdpowiedzDao();
        new Quiz(pytanieIOdpowiedzDao).start();
    }
}
