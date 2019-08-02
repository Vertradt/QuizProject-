package quizAplikacja;

public class ZagrajPonowniePytacz {
    private Wejscie wejscie;

    public ZagrajPonowniePytacz(Wejscie wejscie) {
        this.wejscie = wejscie;
    }


    public boolean zapytaj() {
        Wyswietlacz.komunikat("Czy chcesz grać dalej?");
        return wejscie.getStringInput().equals("tak");

    }
}
