package quizAplikacja;

import java.util.HashMap;
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

}

