package quizAplikacja;

import java.util.ArrayList;
import java.util.List;

class KonwersjeCSV {


    void doCSV(List<Wynik> wyniki) {
        StringBuilder sb = new StringBuilder();
        for (Wynik wynik1 : wyniki) {
            sb.append(wynik1.getImie()).append(",").append(wynik1.zwrocWszystkiePunkty()).append(",\n");
        }
        String CSV = sb.toString();
        CSV = CSV.replace("|", ",");
        System.out.println(CSV);
        Archiwizacja archiwizacja = new Archiwizacja();
        archiwizacja.zapisDoPliku(CSV, ".csv");
        archiwizacja.odczytZPliku("plik CSV", ".csv");
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

