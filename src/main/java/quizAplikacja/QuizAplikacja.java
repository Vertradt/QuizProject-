package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.PytanieIOdpowiedz;
import quizAplikacja.qa.PytanieIOdpowiedzDao;

public class QuizAplikacja {

    public static void main(String[] args) {
        Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao = new PytanieIOdpowiedzDao();
        new Quiz(pytanieIOdpowiedzDao).start();
    }
}
