package quizAplikacja;

import java.util.ArrayList;
import java.util.List;

final class Punktacja {
    //TODO: Różnica COMPARATOR, a COMPARABLE
    private final List<Wynik> wyniki;

    Punktacja() {
        this.wyniki = new ArrayList<>();
    }

    void dodajWynik(Wynik wynik) {
        wyniki.add(wynik);
    }

    List<Wynik> zwrocWyniki() {
        return wyniki;
    }
}
