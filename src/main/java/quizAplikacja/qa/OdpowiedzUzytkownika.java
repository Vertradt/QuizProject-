package quizAplikacja.qa;

import quizAplikacja.Wejscie;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;

    public OdpowiedzUzytkownika(Wejscie wejscie) {
        this.wejscie = wejscie;

    }

    public void sprawdzenieOdpowiedzi() {
        System.out.println("Czy wiedziałeś o tym?");
        String odpowiedz = wejscie.getStringInput();
        String odpowiedzPoprawna = "tak";
        String odpowiedzNiepoprawna = "nie";

        boolean porownanieDlaPoprawnej = odpowiedz.equals(odpowiedzPoprawna);
        boolean porownianieDlaNiepoprawnej = odpowiedz.equals(odpowiedzNiepoprawna);

        if (porownanieDlaPoprawnej) System.out.println("Poprawna odpowiedź");
        else if (!porownianieDlaNiepoprawnej) {
            System.out.println("nie podano odp");
        } else {
            System.out.println("Zła odpowiedź. Czy chcesz grać dalej?");
        }


    }
}
