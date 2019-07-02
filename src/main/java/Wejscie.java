import java.util.Scanner;

public class Wejscie {
    private Scanner scanner;

    public Wejscie(Scanner scanner) {
        this.scanner = scanner;
    }

    int getInput() {

        return scanner.nextInt();
    }

}
