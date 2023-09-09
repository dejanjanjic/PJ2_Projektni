package net.etfbl.pj2.vozila;

import java.util.Random;
import net.etfbl.pj2.vozila.dodaci.TeretniProstor;
import net.etfbl.pj2.osobe.*;
import net.etfbl.pj2.vozila.interfejsi.AutobusInterfejs;

public class Autobus extends Vozilo implements AutobusInterfejs {
    private static final int KAPACITET_PUTNIKA = 51;
    private TeretniProstor teretniProstor = new TeretniProstor();
    public Autobus() {
        super(Vozilo.generisiBrojPutnika(KAPACITET_PUTNIKA), true);
        for (Putnik putnik :
                putnici) {
            if (putnik.getKofer() != null) {
                teretniProstor.dodajKofer(putnik.getKofer());
            }
        }
        vrijemeObradePutnika = 100;
    }

    @Override
    public void run() {

    }

    @Override
    public String toString(){
        return "Autobus " + idVozila + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }

}
