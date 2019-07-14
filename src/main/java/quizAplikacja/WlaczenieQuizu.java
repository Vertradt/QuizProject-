package quizAplikacja;

import quizAplikacja.qa.PytanieIOdpowiedz;

class WlaczenieQuizu {
    private Wejscie wejscie;

    WlaczenieQuizu(Wejscie wejscie) {
        this.wejscie = wejscie;
    }

    void wlacznieQuizu(PytanieIOdpowiedz pytanieIOdpowiedz) {
        System.out.println("Quiz został uruchomiony");
        System.out.println(pytanieIOdpowiedz);
        wejscie.getStringInput();
    }

    @Override
    public String toString() {

        return 1 + " " + "WlaczenieQuizu";
    }
}
