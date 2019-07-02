import java.util.HashMap;
import java.util.Map;

public class Wyswietlacz {
    public static void wyświetlacz() {

        Map<Integer, String> pozycjeMenu = new HashMap<>();
        pozycjeMenu.put(1, "Włącznie Quizu");
        pozycjeMenu.put(2, "Punktacja");
        pozycjeMenu.put(3, "Wyjście z Quizu");
        for (Map.Entry mapa : pozycjeMenu.entrySet()) {
            System.out.println(mapa.getKey() + " " + mapa.getValue());
        }
    }

}

