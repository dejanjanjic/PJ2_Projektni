package net.etfbl.pj2.vozila;

import net.etfbl.pj2.vozila.dodaci.Teret;

import java.util.Random;

public class Kamion extends Vozilo {
    private Teret teret;
    private int deklarisanaMasa;
    private boolean nedozvoljenaMasa;
    private static final int KAPACITET_PUTNIKA = 2;
    private static final int MAX_MASA_DEKLARISANA = 97;

    public Kamion() {
        super(generisiBrojPutnika(KAPACITET_PUTNIKA));
        Random random = new Random();
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

    @Override
    public String toString(){
        return "Kamion " + id + "{\nVozac: " + vozac + "\nBroj putnika: " +
                brojPutnika + "\n}";
    }

}
