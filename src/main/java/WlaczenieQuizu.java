import qa.PytanieIOdpowiedz;
import qa.OdpowiedzUzytkownika;
class WlaczenieQuizu {

    void wlacznieQuizu(PytanieIOdpowiedz pytanieIOdpowiedz) {
        System.out.println("Quiz został uruchomiony");
        System.out.println(pytanieIOdpowiedz);
        OdpowiedzUzytkownika.wprowadzanieOdpowiedzi();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(1 + " " +"WlaczenieQuizu");

        return sb.toString();
    }
}
