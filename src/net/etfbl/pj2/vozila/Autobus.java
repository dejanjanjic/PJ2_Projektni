package net.etfbl.pj2.vozila;

import java.util.Random;
import net.etfbl.pj2.vozila.dodaci.TeretniProstor;
import net.etfbl.pj2.osobe.*;

public class Autobus extends Vozilo {
    private static final int KAPACITET_PUTNIKA = 51;
    private TeretniProstor teretniProstor = new TeretniProstor();
    public Autobus() {
        super(Vozilo.generisiBrojPutnika(KAPACITET_PUTNIKA), true);
        vrijemeObradePutnika = 100;
    }

    @Override
    public String toString(){
        return "Autobus " + id + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }

}
