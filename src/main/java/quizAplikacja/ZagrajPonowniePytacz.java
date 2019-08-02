package quizAplikacja;

public class ZagrajPonowniePytacz {
    private Wejscie wejscie;

    public ZagrajPonowniePytacz(Wejscie wejscie) {
        this.wejscie = wejscie;
    }


    public boolean zapytaj() {
        Wyswietlacz.komunikat("Czy chcesz grać dalej?");
//        SprawdzaczWejscia sprawdzaczWejscia = new SprawdzaczWejscia(wejscie);
//        sprawdzaczWejscia.waliduj(wejscie.getStringInput().equals("tak"), "Wracamy do menu");
        return wejscie.getStringInput().equals("tak");
    }
}
