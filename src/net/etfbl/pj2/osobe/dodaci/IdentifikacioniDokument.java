package net.etfbl.pj2.osobe.dodaci;

import java.util.Random;

public class IdentifikacioniDokument {
    private boolean neispravan;
    public IdentifikacioniDokument(){
        neispravan = new Random().nextInt(100) < 3;
    }
    public boolean isNeispravan(){
        return neispravan;
    }
}
