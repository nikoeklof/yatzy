
import java.util.Scanner;

public class Valikko {

    private Scanner lukija;
    private Pelaajat pelaajat;
    private Peli peli;

    public Valikko() {
        this.lukija = new Scanner(System.in);
        this.pelaajat = new Pelaajat();
        this.peli = new Peli();
    }

    public void aloitus() {
        while (true) {
            System.out.println("1 - Yatzyn säännöt");
            System.out.println("2 - lisää pelaaja");
            System.out.println("3 - poista pelaaja");
            System.out.println("4 - aloita peli\n");
            System.out.println("1, 2, 3 vai 4?\n");
            String komento = lukija.nextLine();
            if(komento.equals("1")) {
                this.tulostaSaannot();
            }
            if(komento.equals("2")) {
                System.out.println("\nSyötä pelaajan nimi.\n");
                String nimi = lukija.nextLine();
                if(nimi.isEmpty()) {
                    System.out.println("\nEi nimeä!\n");
                    this.aloitus();
                }
                pelaajat.lisaaPelaaja(nimi);
            }
            if(komento.equals("3")) {
                System.out.println("\nSyötä poistettavan pelaajan nimi.\n");
                String nimi = lukija.nextLine();
                if(nimi.isEmpty()) {
                    System.out.println("\nEi nimeä!\n");
                    this.aloitus();
                }
                pelaajat.poistaPelaaja(nimi);
            }
            if(komento.equals("4")) {
                if(this.pelaajat.pelaaja.isEmpty()) {
                    this.pelaajat.tulostaPelaajat();
                    this.aloitus();
                } else {
                    peli.pelinKulku(this.pelaajat.pelaaja);
                    break;
                }
            }
            if(!(komento.equals("1")) && !(komento.equals("2")) && 
                !(komento.equals("3")) && !(komento.equals("4"))) {
                System.out.println("\nVirheellinen numero!\n");
                this.aloitus();
            }
        }
    }

    public void tulostaSaannot() {
        System.out.println("\n-------Säännöt-------\n");
        System.out.println("Pelaajia voi olla rajattomasti, tai voit pelata yksin.\nVuoron alussa heitetään kaikki nopat. Vuoron aikana pelaaja saa heittää noppia kolme kertaa.\nJokaisella heitolla saa heittää niin monta noppaa uudestaan kuin haluaa.\nYhtään noppaa ei ole pakko heittää. Kolmea kertaa ei ole pakko heittää.\nKun pelaaja lopettaa heittämisen, saavutettu tulos kirjataan pöytäkirjaan.\nPelaaja saa valita kohdan johon tulos kirjataan.\nMikäli heitetty tulos ei sovi mihinkään kohtaan, pisteiksi tulee nolla pelaajan valitsemaan kohtaan.\nPöytäkirjan täyttöjärjestys on vapaa.\nPöytäkirja jakautuu kahteen osaan: ylä- ja alaosaan.");
        System.out.println("------");
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
        System.out.println("- Yksipari: kaksi kertaa sama silmäluku");
        System.out.println("- Kaksipari: kaksi eri paria");
        System.out.println("- Kolmoisluku: kolme samaa silmälukua");
        System.out.println("- Neloisluku: neljä samaa silmalukua");
        System.out.println("- Pieni suora: numerot 1,2,3,4,5");
        System.out.println("- Suuri suora: numerot 2,3,4,5,6");
        System.out.println("- Täyskäsi: kolmoisluku ja pari");
        System.out.println("- Sattuma: mitä tahansa");
        System.out.println("- Yatzy: viisi samaa lukua");
        System.out.println("------");
        System.out.println("Peli on ohi kun kaikkien pelaajien pöytäkirjat ovat täytetty.\nLoppupisteet on kaikkien pisteiden summa. Eniten pisteitä kerännyt voittaa.");
        System.out.println("--------------------\n");
    }

}
