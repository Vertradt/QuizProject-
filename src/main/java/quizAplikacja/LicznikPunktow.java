package quizAplikacja;

import quizAplikacja.qa.OdpowiedzUzytkownika;

public class LicznikPunktow {
    private OdpowiedzUzytkownika odpowiedzUzytkownika;

    public LicznikPunktow(OdpowiedzUzytkownika odpowiedzUzytkownika) {
        this.odpowiedzUzytkownika = odpowiedzUzytkownika;
    }

    public int punkty() {
        int score = 0;
        score = score + 1;
        System.out.println(score++ + " " + "Punkt");

        return score;

    }
//
//    public void liczeniePunktow(){
//        while (){
//        punkty();
//        }
    }
