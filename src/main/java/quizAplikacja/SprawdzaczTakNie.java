package quizAplikacja;

public class SprawdzaczTakNie {
    private Wejscie wejscie;

    public SprawdzaczTakNie(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    public boolean waliduj(String komunikat1, String komunikat2) {
        String odpowiedz = wejscie.getStringInput();

        switch (odpowiedz) {
            case "tak":
                if (komunikat1 != null) {
                    Wyswietlacz.komunikat(komunikat1);
                }
                return true;
            case "nie":
                if (komunikat2 != null) {
                    Wyswietlacz.komunikat(komunikat2);
                }
                return false;
        }
        return false;
    }
}