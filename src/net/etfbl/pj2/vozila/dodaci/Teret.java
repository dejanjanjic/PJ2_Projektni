package net.etfbl.pj2.vozila.dodaci;

import java.util.Random;

public class Teret {

    private boolean generisatiDokumentaciju;
    private int masa;
    public Teret(int masa){
        generisatiDokumentaciju = new Random().nextBoolean(); //vjerovatnoca da se treba generisati dokumentacija je 50%
        this.masa = masa;
    }

    public boolean isGenerisatiDokumentaciju() {
        return generisatiDokumentaciju;
    }

    public int getMasa() {
        return masa;
    }


}
