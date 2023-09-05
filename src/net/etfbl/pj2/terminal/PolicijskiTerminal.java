package net.etfbl.pj2.terminal;

import net.etfbl.pj2.osobe.Putnik;
import net.etfbl.pj2.vozila.Vozilo;

public abstract class PolicijskiTerminal extends Terminal{

    @Override
    public synchronized boolean obradiVozilo(Vozilo vozilo) {
        //provjeravamo da li vozac ima ispravan dokument
        if(vozilo.getVozac().getIdentifikacioniDokument().isNeispravan()){
            try{
                Thread.sleep(vozilo.getVrijemeObradePutnika());
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            vozilo.izbaciVozaca(vozilo.getVozac());
            vozilo.setMozeProciPolicijskiTerminal(false);
            return false;
        }
        //provjeravamo putnike i dokumente
        for (Putnik putnik :
                vozilo.getPutnici()) {
            try{
                Thread.sleep(vozilo.getVrijemeObradePutnika());
            }
            catch(InterruptedException e){
                e.printStackTrace(); // TODO: 5.9.2023. dodati logger 
            }
            if(putnik.getIdentifikacioniDokument().isNeispravan()){
                vozilo.izbaciPutnika(putnik);
            }
        }
        return true;
    }
}
