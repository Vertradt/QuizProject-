package qa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PytanieIOdpowiedzDao implements Dao<PytanieIOdpowiedz> {
    private List<PytanieIOdpowiedz> listaPytanIOdpowiedzi;

    public PytanieIOdpowiedzDao() {
        listaPytanIOdpowiedzi = inicjalizacja();
    }

    @Override
    public PytanieIOdpowiedz weźLosowe() {
        Random rand = new Random();
        return listaPytanIOdpowiedzi.get(rand.nextInt(listaPytanIOdpowiedzi.size()));
    }

    @Override
    public List<PytanieIOdpowiedz> zwrocWszystkie() {
        return listaPytanIOdpowiedzi;
    }

    private List<PytanieIOdpowiedz> inicjalizacja() {
        List<PytanieIOdpowiedz> pytaniaIOdpowiedzi = new ArrayList<>();
        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(1, new Pytanie("Czy w skład JRE wchodzą Maszyna Wirtualna Javy-JVM, oraz zbiór klas i narzędzi wymaganych do uruchomienia aplikacji w JAVIE?"), new Odpowiedź("tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(2, new Pytanie("Czy JDK to środowisko uruchomieniowe Javy oraz zestaw narzędzi do tworzenia i kompilowaniu kodu w JAVIE."), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(4, new Pytanie("Czy niebędące obiektami dane prymitywne, na których operuje się bezpośrednio świadczą o tym, że JAVA jest w 100% obiektowa?"), new Odpowiedź("Nie")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(5, new Pytanie("Czy konstruktor jest uruchamiany za pomocą słówka 'new' podczas tworzenia nowego obiektu?"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(6, new Pytanie("Czy konstruktor, tak jak metoda zwraca i deklaruje typ zwracany?"), new Odpowiedź("Nie")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(7, new Pytanie("Czy prawdą jest, że nazwa konstruktora nie musi być taka sama jak nazwa klasy, w której się znajduje?"), new Odpowiedź("Nie")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(3, new Pytanie("Czy JVM to maszyna wirtualna i środowisko wykonawcze JAVY."), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(8, new Pytanie("Czy JAVA tworzy konstruktor domyślny jeśli nie zrobi tego programista."), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(9, new Pytanie("Czy przeciązanie 'overloading' polega na posiadaniu przez wiele metod tych samych nazw, lecz o różnej sygnaturze."), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(10, new Pytanie("Przesłaniane 'overriding' występuje gdy klasa bazowa i dziedzicząca posiadają tą samą sygnaturę metody?"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(11, new Pytanie("Czy słowo kluczowe FINAL oznacza, że dana klasa nie może być dziedzioczona, atrybut modyfikowany, a metoda nadpisywana?"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(12, new Pytanie("Czy metody prywatne 'private' mogę być dziedziczone?"), new Odpowiedź("Nie")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(13, new Pytanie("Czy w klasach pochodnych metody 'public' muszą być również 'public'"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(14, new Pytanie("Czy prawdą jest, że metody 'protected' nie muszą być protected lub public w klasach pochodnych?"), new Odpowiedź("Nie")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(15, new Pytanie("Czy każdy obiekt w Javie dziedziczy po klasie Object?"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(16, new Pytanie("Czy abstrakcja, hermetyzacja, polimorfizm i dziedziczenie to zasady OOP"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(17, new Pytanie("Czy Object[], List, Set, Map i Queue to rodzaje kolekcji w Javie"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(18, new Pytanie("Czy w Javie, w przypadku klas, występuje dziedziczenie wielokrotne?"), new Odpowiedź("Nie")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(19, new Pytanie("Czy interfejsy w Javie mogą po sobie dziedziczyć wielokrotnie?"), new Odpowiedź("Tak")));
//        pytaniaIOdpowiedzi.add(new PytanieIOdpowiedz(18, new Pytanie("Pytanie2"), new Odpowiedź("Odpowiedź2")));
        return pytaniaIOdpowiedzi;
    }

}
