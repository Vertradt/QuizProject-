package quizAplikacja.qa;

import quizAplikacja.SprawdzaczTakNie;
import quizAplikacja.Wejscie;
import quizAplikacja.Wynik;
import quizAplikacja.ZagrajPonowniePytacz;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;

    public OdpowiedzUzytkownika(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    public boolean sprawdzenieOdpowiedzi(Wynik wynik) {
        boolean czyPoprawna = new SprawdzaczTakNie(wejscie).waliduj("Poprawna odpowiedź", "Niepoprawna odpowiedź");

        if (czyPoprawna) {
            wynik.dodajPunkt();
            System.out.println(wynik.zwrocWszystkiePunkty());
            //TODO Dodać funkcjonalność odpowiadającą za dodadanie imienia w momencie rezygancji z dalszej gry
            //TODO Podaj imię i wyświetl wynik przed wyjściem do menu

            //TODO Dodaj wynik do punktachi (punktacja.dodajWynik(wynik))
        }

        boolean czyGracDalej = new ZagrajPonowniePytacz(wejscie).zapytaj();
        return czyGracDalej;
    }
}