package qa;

import java.util.Scanner;

public class OdpowiedzUzytkownika {
    Wejscie wejscie = new Wejscie();

    public static String wprowadzanieOdpowiedzi() {
        System.out.println("Czy wiedziałeś o tym?");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
