package quizAplikacja;

import quizAplikacja.qa.PytanieIOdpowiedz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Wyswietlacz {
    static void menu() {

        Map<Integer, String> pozycjeMenu = new HashMap<>();
        pozycjeMenu.put(1, "Włącznie Quizu");
        pozycjeMenu.put(2, "Punktacja");
        pozycjeMenu.put(3, "Wyjście z Quizu");
        for (Map.Entry mapa : pozycjeMenu.entrySet()) {
            System.out.println(mapa.getKey() + " " + mapa.getValue());
        }
    }

    static void komunikat(String komunikat) {
        System.out.println(komunikat);
    }

    static void losowePytanie(PytanieIOdpowiedz pytanie) {
        System.out.println(pytanie);
    }

    static void wyswietlenieImieniaIPunktow(String imie, int punkty) {
        System.out.println(imie + ", " + "uzyskałeś punktów" + " " + punkty);
        System.out.println("Powrót do menu!");
    }

    static void wyswietlanieTablicyWynikow(List<Wynik> wyniki) {
        System.out.println("Lista najlepszych wyników:");
        int j = 0;
        for (Wynik wynik : wyniki) {
            System.out.println(j + 1 + ". " + wynik);
            j++;
        }
    }
}

