package quizAplikacja;

import quizAplikacja.qa.PytanieIOdpowiedz;

import java.util.HashMap;
import java.util.Map;

public class Wyswietlacz {
    static void menu() {

        Map<Integer, String> pozycjeMenu = new HashMap<>();
        pozycjeMenu.put(1, "Włącznie Quizu");
        pozycjeMenu.put(2, "Punktacja");
        pozycjeMenu.put(3, "Wyjście z Quizu");
        for (Map.Entry mapa : pozycjeMenu.entrySet()) {
            System.out.println(mapa.getKey() + " " + mapa.getValue());
        }
    }


    public static void komunikat(String komunikat) {
        System.out.println(komunikat);
    }

    public static void losowePytanie(PytanieIOdpowiedz pytanie) {
        System.out.println(pytanie);
    }

}

