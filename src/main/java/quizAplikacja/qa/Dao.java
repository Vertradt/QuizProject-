package quizAplikacja.qa;

import java.util.List;
public interface Dao<T>{
    // T - typ, na przykład pytania lub odpowiedzi
    //Implementacja będzie wyglądać Dao<Pytanie>
    T weźLosowe();
    List<T> zwrocWszystkie();
}
