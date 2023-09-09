package net.etfbl.pj2.simulacija;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;


import net.etfbl.pj2.terminal.CarinskiTerminal;
import net.etfbl.pj2.terminal.PolicijskiTerminal;
import net.etfbl.pj2.vozila.*;

public class Simulacija {
    public static ArrayBlockingQueue<Vozilo> granicniRed = new ArrayBlockingQueue<Vozilo>(50);

    public static PolicijskiTerminal p1 = new PolicijskiTerminal();
    public static PolicijskiTerminal p2 = new PolicijskiTerminal();
    public static PolicijskiTerminal pk = new PolicijskiTerminal();

    public static CarinskiTerminal c1 = new CarinskiTerminal();
    public static CarinskiTerminal ck = new CarinskiTerminal();

    public static void main(String[] args) {
        final int BROJ_LICNIH_VOZILA = 35;
        final int BROJ_AUTOBUSA = 5;
        final int BROJ_KAMIONA = 50;


//        for (int i = 0; i < BROJ_LICNIH_VOZILA; i++) {
//            granicniRed.add(new LicnoVozilo());
//        }
//        for (int i = 0; i < BROJ_AUTOBUSA; i++) {
//            granicniRed.add(new Autobus());
//        }
        for (int i = 0; i < BROJ_KAMIONA; i++) {
            granicniRed.add(new Kamion());
        }
        //postavljamo vozila na nasumicne pozicije
        //Collections.shuffle(granicniRed);
        //cuvamo pozicije za svako vozilo

        for (Vozilo vozilo :
                granicniRed) {
            vozilo.start();
        }


    }
}