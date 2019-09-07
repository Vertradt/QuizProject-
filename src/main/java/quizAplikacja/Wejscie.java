package quizAplikacja;

import java.util.Scanner;

public class Wejscie {
    private Scanner scanner;

    Wejscie(Scanner scanner) {
        this.scanner = scanner;
    }

    int getIntInput() {
        return scanner.nextInt();
    }

    String getStringInput() {
        return scanner.nextLine();
    }

}
