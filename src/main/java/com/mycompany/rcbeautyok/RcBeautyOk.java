package com.mycompany.rcbeautyok;

import com.mycompany.rcbeautyok.igu.Pantalla;
import com.mycompany.rcbeautyok.persistencia.ControladoraPersis;

public class RcBeautyOk {

    ControladoraPersis controladoraPersis = new ControladoraPersis();
    
    public static void main(String[] args) {
        Pantalla panta = new Pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }
}
