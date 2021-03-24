import java.util.ArrayList;
import java.util.Scanner;

public class Yatzy {
    // Testaamista varten...
    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in);
        Pelaajat peli = new Pelaajat("Yatzy");
        peli.lisaaPelaaja("Niko");
        peli.lisaaPelaaja("Seppo");
        peli.lisaaPelaaja("Matti");
        peli.tulostaPisteet();
        peli.lisaaTulos(2, 4, 3);
        peli.tulostaPelaaja("Matti");
        System.out.println("Pelin voitti: " + peli.tulostaVoittaja());
        peli.lisaaTulos(1, 4, 4);
        System.out.println("Pelin voitti: " + peli.tulostaVoittaja());

    }
}
