package quizAplikacja.qa;

import quizAplikacja.Wejscie;

public class OdpowiedzUzytkownika {
    private Wejscie wejscie;

    public OdpowiedzUzytkownika(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    public void wprowadzanieOdpowiedzi() {
        System.out.println("Czy wiedziałeś o tym?");
        String odpowiedz = wejscie.getStringInput();
        System.out.println(odpowiedz);
    }
}
