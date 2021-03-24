import java.util.ArrayList;
import java.util.Scanner;

public class Pelaajat {

    private ArrayList<Pelaajat> pelaajat = new ArrayList<>();
    private String nimi;
    Poytakirja kortti;
    Scanner lukija = new Scanner(System.in);

    public Pelaajat(String nimi) {
        this.nimi = nimi;
        this.kortti = new Poytakirja();
    }

    public String getNimi() {
        return this.nimi;

    }

    public Pelaajat getPelaaja(int indeksi) {
        return this.pelaajat.get(indeksi);
    }

    public void tulostaPelaaja(String nimi) {
        for (Pelaajat pelaaja : pelaajat) {
            if (nimi.equalsIgnoreCase(pelaaja.nimi)) {
                pelaaja.kortti.laskePisteet();
                System.out.println("--------------------------------------------");
                System.out.println("Pelaajan " + pelaaja.getNimi() + " kortti:");
                System.out.println("--------------------------------------------");
                pelaaja.kortti.tulostaKortti();

            }
        }
    }

    public void tulostaPelaajat() {
        for (Pelaajat pelaaja : pelaajat) {
            System.out.println(pelaaja.getNimi());
        }
    }

    public void lisaaTulos(String pelaajaNimi, int indeksi, int tulos) { // muokkaan tämän toimimaan vuorojen mukaan
        for (Pelaajat pelaaja : pelaajat) {
            if (pelaaja.getNimi().equalsIgnoreCase(pelaajaNimi)) {
                pelaaja.kortti.maara[indeksi] = tulos;
                pelaaja.kortti.laskePisteet();
            }
        }

    }

    public void lisaaPelaaja(String nimi) {
        Pelaajat pelaaja = new Pelaajat(nimi);
        this.pelaajat.add(pelaaja);
        System.out.println("Pelaaja lisätty");
    }

    public void tulostaPisteet() {
        System.out.println("_____________");
        System.out.println("");
        System.out.println("Pistetilanne");
        System.out.println("_____________");
        System.out.println("");
        for (Pelaajat pelaaja : pelaajat) {
            pelaaja.kortti.laskePisteet();
            System.out.println(pelaaja.nimi + ": " + pelaaja.kortti.pisteet[1] + " pistettä.");
        }
        System.out.println("_____________");
    }

    public String tulostaVoittaja() {
        int indeksi = 0;
        Pelaajat voittaja = getPelaaja(indeksi);
        for (int i = 0; i < pelaajat.size(); i++) {
            getPelaaja(indeksi).kortti.laskePisteet();
            getPelaaja(i).kortti.laskePisteet();
            if (getPelaaja(i).kortti.pisteet[1] > voittaja.kortti.pisteet[1]) {
                voittaja = getPelaaja(i);
            }

        }
        return voittaja.getNimi();

    }

}
