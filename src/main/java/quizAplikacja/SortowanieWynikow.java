package quizAplikacja;

import java.util.List;

public class SortowanieWynikow {
    private List<Wynik> wyniki;

    SortowanieWynikow(List<Wynik> wyniki) {
        this.wyniki = wyniki;
    }

    void sortujBombelkowo() {
        for (int j = 0; j < wyniki.size(); j++) {
            for (int i = 0; i < wyniki.size() - 1; i++) {
                if ((wyniki.get(i).getPunkty()) < (wyniki.get(i + 1).getPunkty())) {
                    Wynik temp = wyniki.get(i);
                    wyniki.set(i, wyniki.get(i + 1));
                    wyniki.set(i + 1, temp);
                }
            }
        }
    }
}
