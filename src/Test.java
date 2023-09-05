import net.etfbl.pj2.vozila.*;
import net.etfbl.pj2.osobe.*;

public class Test {
    public static void main(String[] args) {

        //test atutobusa, vjerovatnoce da putnik ima kofer i vjerovatnoce da kofer sadrzi nedozvoljene stvari
//        net.etfbl.pj2.vozila.Autobus[] autobusi = new net.etfbl.pj2.vozila.Autobus[50];
//        for (int i = 0; i < 50; i++) {
//            autobusi[i] = new net.etfbl.pj2.vozila.Autobus();
//        }
//        int i = 0;
//        int brojacKofera = 0;
//        int brojacPutnika = 0;
//        int brojacNedozvoljenihKofera = 0;
//        double sumaProcenataLjudiSaKoferima = 0.0;
//        double sumaProcenataNedozvoljenihKofera = 0.0;
//        for (net.etfbl.pj2.vozila.Autobus bus :
//                autobusi) {
//            net.etfbl.pj2.osobe.Putnik[] putnici = bus.getPutnici();
//            System.out.println(++i + ".");
//            for (net.etfbl.pj2.osobe.Putnik putnik :
//                    putnici) {
//                brojacPutnika++;
//                if (putnik.getKofer() != null){
//                    brojacKofera++;
//                    if(putnik.getKofer().isImaNedozvoljeneStvari()){
//                        brojacNedozvoljenihKofera++;
//                    }
//                }
//
//            }
//            System.out.println("Broj putnika: " + brojacPutnika);
//            System.out.println("Broj kofera: " + brojacKofera);
//            System.out.println("Procenat ljudi sa koferima: " + (double)brojacKofera/brojacPutnika);
//            sumaProcenataLjudiSaKoferima += (double)brojacKofera/brojacPutnika;
//            System.out.println("Procenat nedozvoljenih kofera: " + (double)brojacNedozvoljenihKofera/brojacKofera);
//            sumaProcenataNedozvoljenihKofera += (double)brojacNedozvoljenihKofera/brojacKofera;
//            brojacKofera = 0;
//            brojacPutnika = 0;
//            brojacNedozvoljenihKofera = 0;
//        }
//
//        System.out.println("Srednja vjerovatnoca ljudi sa koferima: " + sumaProcenataLjudiSaKoferima/50);
//        System.out.println("Srednja vjerovatnoca nedozvoljenih kofera: " + sumaProcenataNedozvoljenihKofera/50);
        //test kamiona, vjerovatnoca da je potrebno generisati dokumentaciju
//        net.etfbl.pj2.vozila.Kamion[] kamioni = new net.etfbl.pj2.vozila.Kamion[1000000];
//        int brojacDokumentacija = 0;
//        for (net.etfbl.pj2.vozila.Kamion kamion :
//                kamioni) {
//            kamion = new net.etfbl.pj2.vozila.Kamion();
//            if(kamion.getTeret().isGenerisatiDokumentaciju()){
//                brojacDokumentacija++;
//            }
//        }
//        System.out.println("Odnos kamiona za ciji teret je potrebno generisati dokumentaciju " +
//                "kroz broj ukupnih kamiona: " + (double)brojacDokumentacija/1000000);
//        //test putnika, vjerovatnoca da putnik ima neispravan dokument
//        LicnoVozilo[] vozila = new LicnoVozilo[100000];
//        int brojacPutnika = 0;
//        int brojacNeispravnihDokumenata = 0;
//        for (LicnoVozilo vozilo :
//                vozila) {
//            vozilo = new net.etfbl.pj2.vozila.LicnoVozilo();
//            for (Putnik putnik : vozilo.getPutnici()
//                    ) {
//                brojacPutnika++;
//                if(putnik.getIdentifikacioniDokument().isNeispravan()){
//                    brojacNeispravnihDokumenata++;
//                }
//            }
//            brojacPutnika++; //za vozaca
//            if(vozilo.getVozac().getIdentifikacioniDokument().isNeispravan()){
//                brojacNeispravnihDokumenata++;
//            }
//        }
//        System.out.println("Odnos neispravnih dokumenata sa brojem putnika: " +
//                (double)brojacNeispravnihDokumenata/brojacPutnika);
//        //test kamiona, vjerovatnoca da je stvarna masa veca od deklarisane,
//        //test da li ce biti veca od deklarisane onda kada treba
//        net.etfbl.pj2.vozila.Kamion[] kamioni = new net.etfbl.pj2.vozila.Kamion[1_000_000];
//        int brojacVecihMasa = 0;
//        boolean testNelegalnih = true; //provjerava da li ce u svakom kamionu
//        //koji bi trebao imati vecu masu od deklarisane stvarno i biti veca masa
//        boolean testVecineMase = true; //provjerava da li postoji teret koji je vise od
//        //30 posto veci od deklarisane mase
//
//        for (net.etfbl.pj2.vozila.Kamion kamion :
//                kamioni) {
//            kamion = new net.etfbl.pj2.vozila.Kamion();
//            if(kamion.getDeklarisanaMasa() < kamion.getTeret().getMasa()){
//                brojacVecihMasa++;
//            }
//            if(kamion.isNedozvoljenaMasa() && ((kamion.getDeklarisanaMasa() + 0.3 *
//                    kamion.getDeklarisanaMasa()) < kamion.getTeret().getMasa())){
//                testVecineMase = false;
//            }
//            if(kamion.isNedozvoljenaMasa() &&
//                    (kamion.getDeklarisanaMasa() >= kamion.getTeret().getMasa())){
//                testNelegalnih = false;
//            }
//        }
//        System.out.println("Procenat kamiona sa vecom stvarnom masom od deklarisane: "
//        + (double)brojacVecihMasa/1_000_000);
//        System.out.println("Test ispravnosti: " + testNelegalnih);
//        System.out.println("Svaki nelegalni teret je do 30 posto veci: " + testVecineMase);
//        //test da li se kreira folder kaznjeni ako ne postoji kad se izbaci putnik
//        //test baca IndexOutOfBoundsException ako nema putnika
//        LicnoVozilo vozilo = new LicnoVozilo();
//        vozilo.izbaciPutnika(vozilo.getPutnici().get(0));

    }
}
