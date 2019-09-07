package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.PytanieIOdpowiedz;
import quizAplikacja.qa.PytanieIOdpowiedzDao;

public class QuizAplikacja {

    public static void main(String[] args) {
        Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao = new PytanieIOdpowiedzDao();
        new Quiz(pytanieIOdpowiedzDao).start();
        //TODO: Poniżej znajdują się konwerssje do i z Jsona oraz do i z CSV. Chce to rozdzielić do osobnych klas
        //  Poza tym chce by konwertowała się tablica wyników, a nie pojedyncze wyniki jak poniżej.

//        WynikJson wynikJson = new WynikJson();
//        List<Wynik> wyniki = new ArrayList<>();
//        wyniki.add(new Wynik(12, "Michał"));
//        wyniki.add(new Wynik(11, "Janusz"));
//        wynikJson.konwertsjaDoJsona(wyniki);
//        System.out.println(wynikJson.ZJsonaDoListy(wynikJson.konwertsjaDoJsona(wyniki)));
//
//        System.out.println("---------------------");
//        StringBuilder sb = new StringBuilder();
//        for (Wynik wynik1 : wyniki) {
//            sb.append(wynik1.getImie()).append(",").append(wynik1.zwrocWszystkiePunkty()).append(",\n");
//        }
//        String string = sb.toString();
//        System.out.println(string.replace("|", ","));
//        System.out.println("---------------------");
//
//        String[] wyniks = string.split(
//                ",\\s*");
//        Wynik wynik;
//        List<Wynik> wyniki2 = new ArrayList<>();
//
//        for (int i = 0; i < wyniks.length; i++) {
//            wynik = new Wynik(Integer.parseInt(wyniks[1]), wyniks[0]);
//            wyniki2.add(wynik);
//        }
//        for (Wynik wynik1 : wyniki2) {
//            System.out.println(wynik1);
//        }
//        System.out.println(wyniki2.size());


    }

}
