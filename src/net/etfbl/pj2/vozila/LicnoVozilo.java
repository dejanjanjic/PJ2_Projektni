package net.etfbl.pj2.vozila;

import net.etfbl.pj2.simulacija.Simulacija;
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
        boolean mozeProciPolicijskiTerminal = false;
        boolean mozeProciCarinskiTerminal = false;
        boolean zavrsenaPolicijskaObrada = false;
        boolean zavrsenaCarinskaObrada = false;
        boolean bioNaP1 = false;
        boolean bioNaP2 = false;

        while (!zavrsenaPolicijskaObrada) {

            if(Simulacija.granicniRed.size()>0 && Simulacija.granicniRed.peek() == this) {
                if(Simulacija.p1.isSlobodan()){
                    bioNaP1 = true;
                    System.out.println(this + ": usao u policijski terminal 1!");
                    Simulacija.p1.setSlobodan(false); //zauzimamo policijski terminal
                    Simulacija.granicniRed.poll(); //izlazi iz granicnog reda

                    mozeProciPolicijskiTerminal = Simulacija.p1.obradiVozilo(this); //obradjujemo vozilo
                    if(!mozeProciPolicijskiTerminal){
                        System.out.println("Pao policijsku provjeru!");
                        Simulacija.p1.setSlobodan(true);
                    }
                    else{
                        Simulacija.carinskiRed.add(this);
                    }
                    System.out.println(this + ": izasao iz policijskog terminala 1!");

                    //zavrsava
                    //Simulacija.p1.setSlobodan(true); //izbrisati

                    zavrsenaPolicijskaObrada = true;

                } else if (Simulacija.p2.isSlobodan()) {
                    bioNaP2 = true;
                    System.out.println(this + ": usao u policijski terminal 2!");
                    Simulacija.p2.setSlobodan(false); //zauzimamo policijski terminal
                    Simulacija.granicniRed.poll(); //izlazi iz granicnog reda

                    mozeProciPolicijskiTerminal = Simulacija.p2.obradiVozilo(this); //obradjujemo vozilo
                    if(!mozeProciPolicijskiTerminal){
                        System.out.println("Pao policijsku provjeru!");
                        Simulacija.p2.setSlobodan(true);
                    }
                    else {
                        Simulacija.carinskiRed.add(this);
                    }
                    System.out.println(this + ": izasao iz policijskog terminala 2!");
                    //zavrsava
                    //Simulacija.p2.setSlobodan(true); //izbrisati

                    zavrsenaPolicijskaObrada = true;
                }

            }
        }
        if(mozeProciPolicijskiTerminal){
            while(!zavrsenaCarinskaObrada){
                if(Simulacija.c1.isSlobodan() && Simulacija.carinskiRed.size()>0
                        && Simulacija.carinskiRed.peek() == this){
                    Simulacija.c1.setSlobodan(false);
                    Simulacija.carinskiRed.poll();
                    if(bioNaP1){
                        Simulacija.p1.setSlobodan(true);
                    } else if (bioNaP2) {
                        Simulacija.p2.setSlobodan(true);
                    }


                    System.out.println(this + ": usao u carinski terminal 1!");
                    mozeProciCarinskiTerminal = Simulacija.c1.obradiVozilo(this);
                    if(!mozeProciCarinskiTerminal){
                        System.out.println("Pao carinsku provjeru!");
                    }
                    System.out.println(this + ": izasao iz carinskog terminala 1!");
                    Simulacija.c1.setSlobodan(true);
                    zavrsenaCarinskaObrada = true;
                }
            }
        }

    }
    @Override
    public String toString(){
        return "Automobil " + idVozila + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }


}
