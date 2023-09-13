package net.etfbl.pj2.vozila;

import java.util.Random;

import net.etfbl.pj2.osobe.dodaci.Kofer;
import net.etfbl.pj2.simulacija.Simulacija;
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
            Kofer kofer = putnik.getKofer();
            if (kofer != null) {
                teretniProstor.dodajKofer(kofer);
            }
        }
        vrijemeObradePutnika = 100;
    }

    @Override
    public void run() {
        boolean mozeProciPolicijskiTerminal = false;
        boolean mozeProciCarinskiTerminal = false;
        boolean zavrsenaPolicijskaObrada = false;
        boolean zavrsenaCarinskaObrada = false;

        while (!zavrsenaPolicijskaObrada) {

            if(Simulacija.granicniRed.size()>0 && Simulacija.granicniRed.peek().getIdVozila() == getIdVozila()) {
                if(Simulacija.p1.isSlobodan()){
                    System.out.println(this + ": usao u policijski terminal!");
                    Simulacija.p1.setSlobodan(false); //zauzimamo policijski terminal
                    Simulacija.granicniRed.poll(); //izlazi iz granicnog reda

                    mozeProciPolicijskiTerminal = Simulacija.p1.obradiVozilo(this); //obradjujemo vozilo
                    if(!mozeProciPolicijskiTerminal){
                        System.out.println("Pao policijsku provjeru!");
                        Simulacija.p1.setSlobodan(true);
                    }
                    //zavrsava
                    Simulacija.p1.setSlobodan(true); //izbrisati
                    Simulacija.carinskiRed.add(this);
                    zavrsenaPolicijskaObrada = true;

                } else if (Simulacija.p2.isSlobodan()) {
                    System.out.println(this + ": usao u policijski terminal!");
                    Simulacija.p2.setSlobodan(false); //zauzimamo policijski terminal
                    Simulacija.granicniRed.poll(); //izlazi iz granicnog reda

                    mozeProciPolicijskiTerminal = Simulacija.p2.obradiVozilo(this); //obradjujemo vozilo
                    if(!mozeProciPolicijskiTerminal){
                        System.out.println("Pao policijsku provjeru!");
                        Simulacija.p2.setSlobodan(true);
                    }
                    //zavrsava
                    Simulacija.p2.setSlobodan(true); //izbrisati
                    Simulacija.carinskiRed.add(this);
                    zavrsenaPolicijskaObrada = true;
                }

            }
        }
        if(mozeProciPolicijskiTerminal){
            while(!zavrsenaCarinskaObrada){
                if(Simulacija.c1.isSlobodan() && Simulacija.carinskiRed.size()>0 && Simulacija.carinskiRed.peek().getIdVozila() == getIdVozila()){
                    Simulacija.c1.setSlobodan(false);
                    Simulacija.carinskiRed.poll();
                    System.out.println(this + ": usao u carinski terminal!");
                    mozeProciCarinskiTerminal = Simulacija.c1.obradiVozilo(this);
                    if(!mozeProciCarinskiTerminal){
                        System.out.println("Pao carinsku provjeru!");
                    }
                    Simulacija.c1.setSlobodan(true);
                    zavrsenaCarinskaObrada = true;
                }
            }
        }
    }

    @Override
    public String toString(){
        return "Autobus " + idVozila + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }

}
