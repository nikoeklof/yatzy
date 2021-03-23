import java.util.ArrayList;
import java.util.Scanner;

public class Yatzy {
    //Testaamista varten...
    public static void main(String[] args) throws Exception {
        Scanner lukija = new Scanner(System.in); 

        Pelaajat peli = new Pelaajat("yatzy");
        peli.lisaaPelaaja("Niko");
        peli.lisaaPelaaja("Matti");
        while (true) {
            System.out.println("Mitä tehdään?");
            String komento = lukija.nextLine();
            if (komento.equalsIgnoreCase("hae")) {
                System.out.println("kuka haetaan");
                String haettava = lukija.nextLine();
                peli.tulostaPelaaja(haettava);
            } else if (komento.equalsIgnoreCase("lisaa")) {
                System.out.println("kenelle lisataan");
                String kenelle = lukija.nextLine();
                System.out.println("Indeksiin?");
                int indeksi = Integer.valueOf(lukija.nextLine());
                System.out.println("Tulos?");
                int tulos = Integer.valueOf(lukija.nextLine());
                peli.lisaaTulos(kenelle, indeksi, tulos);
            } else if (komento.equalsIgnoreCase("lopeta")) {
                break;
            }
        }

    }
}
