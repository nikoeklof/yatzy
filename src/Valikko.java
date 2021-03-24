
import java.util.Scanner;

public class Valikko {

    private Scanner lukija;
    private Pelaajat pelaajat = new Pelaajat("Yatzy");

    public Valikko() {
        this.lukija = new Scanner(System.in);
    }

    // kommentoidut komennot ovat luultavasti pelin sisällä
    public void komennot() {
        System.out.println("Aloitus komennot:");
        System.out.println("Saannot - Antaa sinulle Yatzyn säännöt");
        System.out.println("Lisaa - lisää uuden pelaajan");
        System.out.println("Poista - poistaa pelaajan");
        System.out.println("Aloita - aloittaa pelin");
        // System.out.println("Heita - heittää nopat joita ei ole lukittu");
        // System.out.println("Lukitse - lukitsee valitsemasi nopat");
        // System.out.println("Kirjaa - kirjaa tuloksesi ylös pöytäkirjaan haluamaasi
        // kohtaan");
        // System.out.println("Seuraava - siirtyy seuraavaan pelaajaan");
        System.out.println("Lopeta - lopettaa pelin");
        System.out.println("");
        this.komentojenKaynnistys();
    }

    public void komentojenKaynnistys() {
        while (true) {
            System.out.print("Mitä haluat tehdä? ");
            System.out.println("");
            String komento = lukija.nextLine();

            if (komento.equalsIgnoreCase("Lopeta")) {
                break;
            }
            if (komento.equalsIgnoreCase("Saannot")) {
                this.saannot();
            }
            if (komento.equalsIgnoreCase("Lisaa")) {
                // lisää pelaaja vai lisätäänkö pelaaja peli luokassa?
                System.out.println("Pelaajan nimi?");
                String nimi = lukija.nextLine();
                pelaajat.lisaaPelaaja(nimi);

            }
            if (komento.equalsIgnoreCase("Poista")) {
                System.out.println("Kuka poistetaan");
                String nimi = lukija.nextLine();
                pelaajat.poistaPelaaja(nimi);
            }
            if (komento.equalsIgnoreCase("Aloita")) {
                // aloittaa pelin, siirtyy peli luokkaan
                break;
            }
            if (komento.equalsIgnoreCase("Listaa")) {
                pelaajat.tulostaPelaajat();
            }
            // if(this.komento.equalsIgnoreCase("Heita")) {
            // toteuttaa noppien heittämisen
            // }
            // if(this.komento.equalsIgnoreCase("Lukitse")) {
            // lukitsee annetut numerot
            // }
            // if(this.komento.equalsIgnoreCase("Kirjaa")) {
            // näytä pöytäkirja tällä hetkellä
            // kirjaa tulos pöytäkirjaan käyttäjän antamaan paikkaan
            // }
            // if(this.komento.equalsIgnoreCase("Seuraava")) {
            // lopettaa pelaajan vuoron ja siirtyy seuraavan pelaajaan
            // }
        }
    }

    public void saannot() {
        System.out.println("Säännöt");
        System.out.println("");
        System.out.println("Pelaajia voi olla rajattomasti, tai voit pelata yksin.");
        System.out.println(
                "Vuoron alussa heitetään kaikki nopat. Vuoron aikana pelaaja saa heittää noppia kolme kertaa.");
        System.out.println(
                "Jokaisella heitolla voi lukita osan nopista. Loput voi heittää uudestaan. Yhtään noppaa ei ole pakko lukita.");
        System.out
                .println("Kolmea kertaa ei ole pakko heittää, kaikki nopat saa lukita vaikka ensimmäisellä heitolla.");
        System.out.println("");
        System.out.println("Kun pelaaja lopettaa heittämisen, saavutettu tulos kirjataan pöytäkirjaan.");
        System.out.println("Pelaaja saa valita kohdan johon tulos kirjataan.");
        System.out.println("Mikäli heitetty tulos ei sovi mihinkään kohtaan, pisteiksi tulee nolla.");
        System.out.println("");
        System.out.println("Pöytäkirjan täyttöjärjestys on vapaa.");
        System.out.println("Pöytäkirja jakautuu kahteen osaan: ylä- ja alaosaan.");
        System.out.println("");
        System.out.println("Yläosalla on kohdat:");
        System.out.println("- Ykköset: tavoite on saada 1-5 kpl 1-silmälukuja");
        System.out.println("- Kakkoset: tavoite on saada 1-5 kpl 2-silmälukuja");
        System.out.println("- Kolmoset: tavoite on saada 1-5 kpl 3-silmälukuja");
        System.out.println("- Neloset: tavoite on saada 1-5 kpl 4-silmälukuja");
        System.out.println("- Viitoset: tavoite on saada 1-5 kpl 5-silmälukuja");
        System.out.println("- Kuutoset: tavoite on saada 1-5 kpl 6-silmälukuja");
        System.out.println("- Välisumma: yllä olevien summa");
        System.out.println("- Bonus: jos välisumma on yli 63 pistettä, saa pelaaja bonus 50 pistettä");
        System.out.println("");
        System.out.println("Alaosassa on kohdat:");
        System.out.println("- Yksi pari: kaksi kertaa sama silmäluku");
        System.out.println("- Kaksi paria: kaksi eri paria");
        System.out.println("- Kolmoisluku: kolme samaa silmälukua");
        System.out.println("- Neloisluku: neljä samaa silmalukua");
        System.out.println("- Pieni suora: numerot 1,2,3,4,5");
        System.out.println("- Suuri suora: numerot 2,3,4,5,6");
        System.out.println("- Täyskäsi: kolmoisluku ja pari");
        System.out.println("- Sattuma: mitä tahansa");
        System.out.println("- Yatzy: viisi samaa lukua");
        System.out.println("");
        System.out.println("Pelaajan peli on ohi kun kaikki kohdat pöytäkirjasta on täytetty.");
        System.out.println("Loppupisteet on kaikkien pisteiden summa. Eniten pisteitä kerännyt voittaa.");
        System.out.println("");
    }

}
