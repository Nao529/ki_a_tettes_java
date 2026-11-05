package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.TettesModel;

public class JatekView {
    Scanner beolvas = new Scanner(System.in);
    
    public void megjelenitFeladat() {
        System.out.println("Ki a tettes, ha 3 állítás igaz?");
    }
    
    public void megjelenitAllitasok(ArrayList<TettesModel> tettesek) {
        char betu = 'a';
        for (TettesModel tettes : tettesek) {
            System.out.println(betu + ") " + tettes.getNev()+ ": " + tettes.getAllitas());
            betu++;
        }
    }
    
    public String bekerValasz() {
        System.out.println("\nSzerinted ki a tettes? (a, b, c, d)");
        return beolvas.nextLine();
    }
    
    public void megjelenitEredmeny(boolean helyes) {
        if (helyes) {
            System.out.println("Helyes válasz");
        } else {
            System.out.println("Sajnos nem ez a helyes válasz");
        }
    }
}
