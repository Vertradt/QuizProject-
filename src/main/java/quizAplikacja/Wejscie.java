package quizAplikacja;

import java.util.Scanner;

public class Wejscie {
    private Scanner scanner;

    public Wejscie(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getIntInput() {
        return scanner.nextInt();
    }

     public String getStringInput() {
        return scanner.nextLine();
    }

}
