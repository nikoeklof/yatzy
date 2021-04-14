import java.util.Scanner;
import java.util.ArrayList;

public class Peli {

    private Scanner lukija;
    private Pelaajat pelaajat;
    private Nopat nopat;

    public Peli() {
        this.lukija = new Scanner(System.in);
        this.pelaajat = new Pelaajat();
        this.nopat = new Nopat();
    }
    public void pelinKulku(ArrayList<Pelaaja> pelaajatLista) {
        for(Pelaaja pelaaja : pelaajatLista) {
            this.pelaajat.pelaaja.add(pelaaja);
        }
        System.out.println("\n---Peli on alkanut!---\n");
        this.pelaajat.tulostaPelaajat();
        while(!(this.ovatkoPoytakirjatTaynna(this.pelaajat.pelaaja))) {
            for(Pelaaja pelaaja1 : this.pelaajat.pelaaja) {
                System.out.println("\n---" + pelaaja1.getNimi() + " on vuorossa---");
                this.nopat.autoRun(lukija, pelaaja1);
            }
        }
        System.out.println("\n" + pelaajat.tulostaVoittaja());
        System.out.println("\n----Peli loppui!----\n");
    }

    public boolean ovatkoPoytakirjatTaynna(ArrayList<Pelaaja> pelaaja) {
        boolean taynna = false;
        for(Pelaaja pelaaja1 : pelaaja) {
            if(pelaaja1.onkoPoytakirjaTaynna()) {
                taynna = true;
            } else {
                taynna = false;
            }
        }
        return taynna;
    }
}
