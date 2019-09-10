package quizAplikacja;

import java.util.ArrayList;
import java.util.List;

public class KonwersjeCSV {


    void doCSV(List<Wynik> wyniki) {
        StringBuilder sb = new StringBuilder();
        for (Wynik wynik1 : wyniki) {
            sb.append(wynik1.getImie()).append(",").append(wynik1.zwrocWszystkiePunkty()).append(",\n");
        }
        String CSV = sb.toString();
        System.out.println(CSV.replace("|", ","));
        zCsvDoListy(CSV);
    }

    void zCsvDoListy(String string) {
        String[] wyniks = string.split(
                ",\\n");
        String[] strings;
        Wynik wynik;
        List<Wynik> wyniki2 = new ArrayList<>();
        for (String s : wyniks) {
            strings = s.split(",");
            wynik = new Wynik(Integer.parseInt(strings[1]), strings[0]);
            wyniki2.add(wynik);
        }
        for (Wynik wynik1 : wyniki2) {
            System.out.println(wynik1);
        }
        System.out.println(wyniki2.size());

    }
}

