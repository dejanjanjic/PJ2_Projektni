package net.etfbl.pj2.vozila;

import net.etfbl.pj2.vozila.Vozilo;

public class LicnoVozilo extends Vozilo {
    private static final int KAPACITET_PUTNIKA = 4;

    public LicnoVozilo() {
        super(generisiBrojPutnika(KAPACITET_PUTNIKA));
        vrijemeObradePutnika = 500;
    }

    public void policijskaKontrola(){

    }

    @Override
    public String toString(){
        return "Automobil " + id + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }


}
