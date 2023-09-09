package net.etfbl.pj2.vozila;

import net.etfbl.pj2.vozila.Vozilo;
import net.etfbl.pj2.vozila.interfejsi.LicnoVoziloInterfejs;

public class LicnoVozilo extends Vozilo implements LicnoVoziloInterfejs {
    private static final int KAPACITET_PUTNIKA = 4;

    public LicnoVozilo() {
        super(generisiBrojPutnika(KAPACITET_PUTNIKA));
        vrijemeObradePutnika = 500;
    }

    public void policijskaKontrola(){

    }

    @Override
    public void run() {

    }
    @Override
    public String toString(){
        return "Automobil " + idVozila + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }


}
