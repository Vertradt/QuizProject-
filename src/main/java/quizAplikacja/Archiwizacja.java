package quizAplikacja;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archiwizacja {

    void zapisDoPliku(String tresc, String rozszezenie) {
        try {
            FileWriter fileWriter = new FileWriter(rozszezenie);
            fileWriter.write(tresc);
            fileWriter.close();
        } catch (IOException iox) {
            System.out.println("Problem z zapisem pliku");
        }
    }

    String odczytZPliku(String nazwa, String rozszezenie) {
        File file = new File(rozszezenie);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (IOException iox) {
            iox.printStackTrace();
        }
        sc.useDelimiter("\\Z");
        System.out.println("Informacja odczytana z " + nazwa + ": " + sc.next());

        return rozszezenie;
    }


}
