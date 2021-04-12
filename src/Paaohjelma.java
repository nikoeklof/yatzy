import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pelaajat pelaavat = new Pelaajat();
        Nopat nopat = new Nopat();
        pelaavat.lisaaPelaaja("mauno");
        for (int i = 0; i < 15; i++) {
            pelaavat.pelaaja.get(0).lisaaPisteita(i, 2);
        }
        pelaavat.pelaaja.get(0).onkoPoytakirjaTaynna();

    }
}
