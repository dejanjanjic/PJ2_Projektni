package net.etfbl.pj2.osobe.dodaci;

import java.util.Random;

public class Kofer {
    private boolean imaNedozvoljeneStvari;

    public Kofer(){
        imaNedozvoljeneStvari = new Random().nextInt(100) < 10;
    }

    public boolean isImaNedozvoljeneStvari() {
        return imaNedozvoljeneStvari;
    }
}
