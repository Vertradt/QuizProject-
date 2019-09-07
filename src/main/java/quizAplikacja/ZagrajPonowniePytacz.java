package quizAplikacja;

public class ZagrajPonowniePytacz {
    private Wejscie wejscie;

    public ZagrajPonowniePytacz(Wejscie wejscie) {
        this.wejscie = wejscie;
    }


    public boolean zapytaj() {
        Wyswietlacz.komunikat("Czy chcesz grać dalej?");
        SprawdzaczTakNie sprawdzaczWejscia = new SprawdzaczTakNie(wejscie);
        boolean odpowiedz = sprawdzaczWejscia.waliduj(null, "Zaraz nastąpi powrót do menu, lecz najpierw...");

        return odpowiedz;
    }
}
