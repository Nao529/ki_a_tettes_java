package model;

public class TettesModel {

    private String nev;
    private String allitas;
    private boolean igaz;

    public TettesModel(String nev, String allitas, boolean igaz) {
        this.nev = nev;
        this.allitas = allitas;
        this.igaz = igaz;
    }

    public String getNev() {
        return nev;
    }
    public String getAllitas() {
        return allitas;
    }
    public boolean isIgaz() {
        return igaz;
    }
}