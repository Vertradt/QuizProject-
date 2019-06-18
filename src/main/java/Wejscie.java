import java.util.Scanner;

public class Wejscie {
    private static Scanner scanner;

    Wejscie(Scanner scanner){
        this.scanner = scanner;
    }

        static int getId() {
        Wyswietlacz.wyswietla();

        int odpowiedzUzytownika = scanner.nextInt();
        return odpowiedzUzytownika;
    }
}
