package qa;

import java.util.ArrayList;
import java.util.List;

public class PytanieDao implements Dao<Pytanie> {
    private List<Pytanie> listaPytań;

    public PytanieDao() {
        this.listaPytań = generowanieListyPytań();
    }

    private List<Pytanie> generowanieListyPytań() {
        List<Pytanie> rezultat = new ArrayList<>();
        rezultat.add(new Pytanie("Pytanie pierwsze"));
        rezultat.add(new Pytanie("Drugie pytanie"));
        return rezultat;
    }

    @Override
    public Pytanie weźLosowe() {
        return null; //TODO: Zwróć losowe pytanie z listy pytań
    }

    @Override
    public List<Pytanie> zwrocWszystkie() {
        return listaPytań;
    }
}
