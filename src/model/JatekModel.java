package model;

import java.util.ArrayList;

public class JatekModel {

    private ArrayList<TettesModel> tettesek;
    private String helyesValasz;

    public JatekModel() {
        tettesek = new ArrayList<>();
        tettesek.add(new TettesModel("Anna", "Béla a tettes.", true));
        tettesek.add(new TettesModel("Béla", "Csaba a tettes.", false));
        tettesek.add(new TettesModel("Csaba", "Nem Béla a tettes.", false));
        tettesek.add(new TettesModel("Dezső", "Nem Csaba a tettes.", false));
        helyesValasz = "a";
    }

    public ArrayList<TettesModel> getTettesek() {
        return tettesek;
    }

    public boolean ellenorzes(String valasz) {
        if (valasz.equals("a") || valasz.equals("A")) {
            return tettesek.get(0).isIgaz();
        } else if (valasz.equals("b") || valasz.equals("B")) {
            return tettesek.get(1).isIgaz();
        } else if (valasz.equals("c") || valasz.equals("C")) {
            return tettesek.get(2).isIgaz();
        } else if (valasz.equals("d") || valasz.equals("D")) {
            return tettesek.get(3).isIgaz();
        } else {
            return false;
        }
    }
}