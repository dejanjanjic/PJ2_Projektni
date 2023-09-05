package net.etfbl.pj2.simulacija;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import net.etfbl.pj2.vozila.*;

public class Simulacija {
    public static void main(String[] args) {
        final int BROJ_LICNIH_VOZILA = 35;
        final int BROJ_AUTOBUSA = 5;
        final int BROJ_KAMIONA = 10;


        LinkedList<Vozilo> granicniRed = new LinkedList<>();
        for (int i = 0; i < BROJ_LICNIH_VOZILA; i++) {
            granicniRed.add(new LicnoVozilo());
        }
        for (int i = 0; i < BROJ_AUTOBUSA; i++) {
            granicniRed.add(new Autobus());
        }
        for (int i = 0; i < BROJ_KAMIONA; i++) {
            granicniRed.add(new Kamion());
        }
        //postavljamo vozila na nasumicne pozicije
        Collections.shuffle(granicniRed);


    }
}