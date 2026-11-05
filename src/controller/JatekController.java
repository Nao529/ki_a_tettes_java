package controller;

import model.JatekModel;
import view.JatekView;

public class JatekController {
    private JatekModel model;
    private JatekView view;

    public JatekController() {
        model = new JatekModel();
        view = new JatekView();
    }
    
    public void jatekIndito() {
        view.megjelenitFeladat();
        view.megjelenitAllitasok(model.getTettesek());
        String valasz = view.bekerValasz();
        boolean helyes = model.ellenorzes(valasz);
        view.megjelenitEredmeny(helyes);
    }
}
