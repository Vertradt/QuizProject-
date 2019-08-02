package quizAplikacja;

public class SprawdzaczWejscia {
    private Wejscie wejscie;

    public SprawdzaczWejscia(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    public String waliduj(String komuniat1, String komunikat2) {
        String odpowiedz = wejscie.getStringInput();

        switch (odpowiedz) {
            case "tak":
                Wyswietlacz.komunikat(komuniat1);
                break;

            case "nie":
                Wyswietlacz.komunikat(komunikat2);
                break;
        }

        return odpowiedz;
    }
}
