package quizAplikacja;

import java.util.List;

class KonwersjaJson {
    private Punktacja punktacja;

    public KonwersjaJson(Punktacja punktacja) {
        this.punktacja = punktacja;
    }

    void konwertujDoJson() {
        WynikJson wynikJson = new WynikJson();
        List<Wynik> wyniki = punktacja.zwrocWyniki();
        wynikJson.konwertsjaDoJsona(wyniki);
        kowersjaZJsonDoListy(wynikJson, wyniki);
        new KonwersjaDoCSV().doCSV(wyniki);
    }

    private void kowersjaZJsonDoListy(WynikJson wynikJson, List<Wynik> wyniki) {
        System.out.println(wynikJson.ZJsonaDoListy(wynikJson.konwertsjaDoJsona(wyniki)));
    }
}
