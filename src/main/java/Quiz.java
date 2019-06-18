import java.util.Scanner;

class Quiz {

    void start() {
        Scanner scanner = new Scanner(System.in);
        Wejscie wejscie = new Wejscie(scanner);
        new Menu().uruchom();
    }
}
