
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
            System.out.println("4 - aloita peli");
            System.out.println("");
            System.out.println("1, 2, 3 vai 4?");
            int komento = Integer.valueOf(lukija.nextLine());
            System.out.println("");
            if(komento == 1) {
                this.tulostaSaannot();
            }
            if(komento == 2) {
                System.out.println("Syötä pelaajan nimi.");
                String nimi = lukija.nextLine();
                if(nimi.isEmpty()) {
                    System.out.println("Ei nimeä!");
                }
                pelaajat.lisaaPelaaja(nimi);
            }
            if(komento == 3) {
                System.out.println("Syötä poistettavan pelaajan nimi.");
                String nimi = lukija.nextLine();
                if(nimi.isEmpty()) {
                    System.out.println("Ei nimeä!");
                }
                pelaajat.poistaPelaaja(nimi);
            }
            if(komento == 4) {
                peli.pelinKulku(pelaajat);
                //pelaaja lista on tyhjä, miksi?
                //Anna lista argumenttina pelinKulku - metodille, muuta metodia myös niin, että se vaatii argumentiksi juuri Pelaajat-listan. 
                //syntaxi tässä olisi tälläinen: peli.pelinKulku(pelaajat);
                //ja metodin pitäisi Peli-luokassa olla: pelinKulku(Pelaajat pelaajat).  \\Niko
                break;
            }
            if(komento < 1 || komento > 4) {
                System.out.println("Virheellinen numero!");
            }
        }
    }

    public void tulostaSaannot() {
        System.out.println("-------Säännöt-------");
        System.out.println("Pelaajia voi olla rajattomasti, tai voit pelata yksin.");
        System.out.println("Vuoron alussa heitetään kaikki nopat. Vuoron aikana pelaaja saa heittää noppia kolme kertaa.");
        System.out.println("Jokaisella heitolla saa heittää niin monta noppaa uudestaan kuin haluaa.");
        System.out.println("Yhtään noppaa ei ole pakko heittää. Kolmea kertaa ei ole pakko heittää.");
        System.out.println("Kun pelaaja lopettaa heittämisen, saavutettu tulos kirjataan pöytäkirjaan.");
        System.out.println("Pelaaja saa valita kohdan johon tulos kirjataan.");
        System.out.println("Mikäli heitetty tulos ei sovi mihinkään kohtaan, pisteiksi tulee nolla.");
        System.out.println("Pöytäkirjan täyttöjärjestys on vapaa.");
        System.out.println("Pöytäkirja jakautuu kahteen osaan: ylä- ja alaosaan.");
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
        System.out.println("- Yksi pari: kaksi kertaa sama silmäluku");
        System.out.println("- Kaksi paria: kaksi eri paria");
        System.out.println("- Kolmoisluku: kolme samaa silmälukua");
        System.out.println("- Neloisluku: neljä samaa silmalukua");
        System.out.println("- Pieni suora: numerot 1,2,3,4,5");
        System.out.println("- Suuri suora: numerot 2,3,4,5,6");
        System.out.println("- Täyskäsi: kolmoisluku ja pari");
        System.out.println("- Sattuma: mitä tahansa");
        System.out.println("- Yatzy: viisi samaa lukua");
        System.out.println("------");
        System.out.println("Peli on ohi kun kaikkien pelaajien pöytäkirjat ovat täytetty.");
        System.out.println("Loppupisteet on kaikkien pisteiden summa. Eniten pisteitä kerännyt voittaa.");
        System.out.println("--------------------");
    }

}
