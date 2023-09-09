package net.etfbl.pj2.vozila;

import net.etfbl.pj2.simulacija.Simulacija;
import net.etfbl.pj2.vozila.dodaci.CarinskaDokumentacija;
import net.etfbl.pj2.vozila.dodaci.Teret;
import net.etfbl.pj2.vozila.interfejsi.KamionInterfejs;

import java.util.Random;

public class Kamion extends Vozilo implements KamionInterfejs {
    private Teret teret;
    private int deklarisanaMasa;
    private boolean nedozvoljenaMasa;
    private CarinskaDokumentacija carinskaDokumentacija;
    private boolean trebaCarinskaDokumentacija;

    private static final int KAPACITET_PUTNIKA = 2;
    private static final int MAX_MASA_DEKLARISANA = 97;

    public Kamion() {
        super(generisiBrojPutnika(KAPACITET_PUTNIKA));
        Random random = new Random();
        trebaCarinskaDokumentacija = random.nextBoolean();
        deklarisanaMasa = random.nextInt(MAX_MASA_DEKLARISANA) + 4;
        nedozvoljenaMasa = random.nextInt(100) < 20;
        if(nedozvoljenaMasa){
            teret = new Teret(random.nextInt((int) (0.3 * deklarisanaMasa)) + deklarisanaMasa + 1);
        }
        else{
            teret = new Teret(deklarisanaMasa);
        }
        vrijemeObradePutnika = 500;
    }

    @Override
    public void run() {


            while (true) {

                if(Simulacija.granicniRed.size()>0 && Simulacija.granicniRed.peek().getIdVozila() == getIdVozila() && Simulacija.pk.isSlobodan()) {
                    Simulacija.pk.setSlobodan(false); //zauzimamo policijski terminal
                    Simulacija.granicniRed.poll(); //izlazi iz granicnog reda

                    Simulacija.pk.obradiVozilo(this); //obradjujemo vozilo
                    //zavrsava
                    mozeProciPolicijskiTerminal = true;

                    break;
                }


        }
    }

    public Teret getTeret() {
        return teret;
    }

    public void setTeret(Teret teret) {
        this.teret = teret;
    }

    public int getDeklarisanaMasa() {
        return deklarisanaMasa;
    }

    public void setDeklarisanaMasa(int deklarisanaMasa) {
        this.deklarisanaMasa = deklarisanaMasa;
    }

    public boolean isNedozvoljenaMasa() {
        return nedozvoljenaMasa;
    }

    public void setNedozvoljenaMasa(boolean nedozvoljenaMasa) {
        this.nedozvoljenaMasa = nedozvoljenaMasa;
    }

    public void setCarinskaDokumentacija(CarinskaDokumentacija carinskaDokumentacija) {
        this.carinskaDokumentacija = carinskaDokumentacija;
    }

    public CarinskaDokumentacija getCarinskaDokumentacija() {
        return carinskaDokumentacija;
    }

    public boolean isTrebaCarinskaDokumentacija() {
        return trebaCarinskaDokumentacija;
    }

    @Override
    public String toString(){
        return "Kamion " + idVozila + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }

}
