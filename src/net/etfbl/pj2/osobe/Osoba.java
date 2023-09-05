package net.etfbl.pj2.osobe;

import java.util.Random;
import net.etfbl.pj2.osobe.dodaci.*;

public abstract class Osoba{
    protected IdentifikacioniDokument identifikacioniDokument;
    protected Kofer kofer; //ako je null nema ga
    protected String ime;
    protected static int rBr = 0;
    public Osoba(){
        this(false);
    }

    public Osoba(boolean mozeImatiKofer){
        ime = "Putnik" + (++rBr);
        identifikacioniDokument = new IdentifikacioniDokument();
        if(mozeImatiKofer){
            kofer = new Random().nextInt(100) < 70 ? new Kofer() : null;
        }
        else {
            kofer = null;
        }
    }

    public IdentifikacioniDokument getIdentifikacioniDokument() {
        return identifikacioniDokument;
    }

    public Kofer getKofer() {
        return kofer;
    }
}
