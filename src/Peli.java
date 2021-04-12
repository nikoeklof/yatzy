
import java.util.Scanner;

public class Peli {

    private Scanner lukija;
    private Pelaajat pelaajat;

    // private Nopat nopat;

    public Peli() {
        this.lukija = new Scanner(System.in);
        this.pelaajat = new Pelaajat();
        // Ei tarvii luoda pöytäkirjaa, Pelaaja luokka luo pöytäkirjan, mikä on
        // pelaajakohtainen.
        // haluamasi pelaajan pöytäkirjaan pääsee käsiksi tarvittaessa syntaxilla:
        // pelaajat.pelaaja.get(pelaajan indeksi listassa).getPoytakirja()
        // this.nopat = new Nopat;
    }

    public void pelinKulku(Pelaajat pelaajat) {
        for (Pelaaja pelaaja : pelaajat.pelaaja) {
            this.pelaajat.pelaaja.add(pelaaja);
        }
        System.out.println("Peli on alkanut!");
        System.out.println("");
        this.pelaajat.tulostaPelaajat();

        for (Pelaaja pelaaja : this.pelaajat.pelaaja) {
            int vuoroja = 3;
            System.out.println(pelaaja.getNimi() + " on vuorossa!" + vuoroja + " vuoroa jäljellä.");
            System.out.println("");
            System.out.println("Heitetään 5 noppaa!");
            System.out.println("");
            // kaikkien noppien heitto
            while (vuoroja > 0) {
                System.out.println("");
                System.out.println("1 - heitä noppia uudestaan");
                System.out.println("2 - valitse yhdistelmä");
                int komento = Integer.valueOf(lukija.nextLine());
                System.out.println("");
                if (komento == 1) {
                    // noppien heitto uudelleen
                    // tulos integer täältä
                }
                if (komento == 2) {
                    System.out.println("Mihin haluat lisätä pisteet?");
                    int lisays = Integer.valueOf(lukija.nextLine());
                    int indeksi = lisays - 1;
                    if (pelaaja.onkoTaytetty(indeksi)) {
                        System.out.println("Virhe! Tämä yhdistelmä on jo käytössä.");
                        System.out.print("Syötä toinen yhdistelmä:");
                        lisays = Integer.valueOf(lukija.nextLine());
                        indeksi = lisays - 1;
                    } else {
                        // pelaaja.lisaaPisteita(indeksi, tulos);
                    }
                    break;
                }
                System.out.println("Seuraava pelaaja!");
                System.out.println("");
            }
        }
    }

}
