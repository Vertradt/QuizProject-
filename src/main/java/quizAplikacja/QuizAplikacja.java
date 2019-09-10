package quizAplikacja;

import quizAplikacja.qa.Dao;
import quizAplikacja.qa.PytanieIOdpowiedz;
import quizAplikacja.qa.PytanieIOdpowiedzDao;

public class QuizAplikacja {


    public static void main(String[] args) {
        Dao<PytanieIOdpowiedz> pytanieIOdpowiedzDao = new PytanieIOdpowiedzDao();
        new Quiz(pytanieIOdpowiedzDao).start();


        //        WynikJson wynikJson = new WynikJson();
//        List<Wynik> wyniki = new ArrayList<>();
//        wyniki.add(new Wynik(11, "Janusz"));
//        wyniki.add(new Wynik(12, "Michał"));
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
//                ",\\n");
//        System.out.println("---------------------");
//        String[] strings;
//        Wynik wynik;
//        List<Wynik> wyniki2 = new ArrayList<>();
//        for (String s : wyniks) {
//            strings = s.split(",");
//            wynik = new Wynik(Integer.parseInt(strings[1]), strings[0]);
//            wyniki2.add(wynik);
//        }
//        for (Wynik wynik1 : wyniki2) {
//            System.out.println("Dupa " + wynik1);
//        }
//        System.out.println(wyniki2);
//        System.out.println(wyniki2.size());


    }

}
