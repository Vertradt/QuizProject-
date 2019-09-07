package quizAplikacja;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WynikJson {
    private Gson gson = new Gson();

    public String konwertsjaDoJsona(List<Wynik> wyniki) {
        String s = gson.toJson(wyniki);
        System.out.println(s);
        return gson.toJson(wyniki);
    }
    public List<Wynik> ZJsonaDoListy(String wynikJson){
        Type listType = new TypeToken<ArrayList<Wynik>>(){}.getType();
        return gson.fromJson(wynikJson, listType);
    }

}
