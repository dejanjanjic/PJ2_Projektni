package net.etfbl.pj2.osobe.dodaci;


import java.io.Serializable;
import java.util.Random;

public class IdentifikacioniDokument implements Serializable {
    private boolean neispravan;
    public IdentifikacioniDokument(){
        neispravan = new Random().nextInt(100) < 3;
    }
    public boolean isNeispravan(){
        return neispravan;
    }
}
