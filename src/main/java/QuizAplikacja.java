import qa.Dao;
import qa.Pytanie;
import qa.PytanieDao;

import java.util.Scanner;

public class QuizAplikacja {

    public static void main(String[] args) {
//        Quiz quiz = new Quiz();
//        quiz.start();
        Dao<Pytanie> pytanie = new PytanieDao();
        System.out.println(pytanie.zwrocWszystkie());
        // TODO: Podepnij lokalne repo do zdalnego (git remote) i zrób gitIgnore (Maven, Java, Inelij + all)
        //  Losowe pytanie
        //  Menu.menu();
        //  poczytaj o Dao i Mavenie,
        //  zainstaluj Mavena i Jave

        new Quiz().start();

    }
}
