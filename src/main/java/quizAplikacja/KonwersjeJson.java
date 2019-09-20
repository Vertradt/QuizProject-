package quizAplikacja;

import java.util.List;

class KonwersjeJson {
    private Punktacja punktacja;

    KonwersjeJson(Punktacja punktacja) {
        this.punktacja = punktacja;
    }

    void konwertujDoJson() {
        WynikJson wynikJson = new WynikJson();
        List<Wynik> wyniki = punktacja.zwrocWynikiPosortowane();
        String wynikiJson = wynikJson.konwertsjaDoJsona(wyniki);
        kowersjaZJsonDoListy(wynikJson, wyniki);
        Archiwizacja archiwizacja = new Archiwizacja();
        archiwizacja.zapisDoPliku( wynikiJson, ".json");
        archiwizacja.odczytZPliku("plik Json", ".json");

        new KonwersjeCSV().doCSV(wyniki);
    }

    private void kowersjaZJsonDoListy(WynikJson wynikJson, List<Wynik> wyniki) {
        System.out.println(wynikJson.ZJsonaDoListy(wynikJson.konwertsjaDoJsona(wyniki)));
    }
}
