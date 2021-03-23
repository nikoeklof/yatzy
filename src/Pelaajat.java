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

    public ArrayList<Pelaajat> getPelaajat() {
        return pelaajat;
    }

    public void tulostaPelaaja(String nimi) {
        for (Pelaajat pelaaja : pelaajat) {
            if (nimi.equalsIgnoreCase(pelaaja.nimi)) {
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
                break;
            }
        }

    }

    public void lisaaPelaaja(String nimi) {
        Pelaajat pelaaja = new Pelaajat(nimi);
        this.pelaajat.add(pelaaja);
        System.out.println("Pelaaja lisätty");
    }

}
