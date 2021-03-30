import java.util.ArrayList;

public class Pelaajat {

    public ArrayList<Pelaaja> pelaaja;

    public Pelaajat() {
        this.pelaaja = new ArrayList<Pelaaja>();
    }

    public void poistaPelaaja(String nimi) {
        if (pelaaja.isEmpty()) {
            System.out.println("");
            System.out.println("Ei pelaajia!");
            System.out.println("");
        } else {
            for (int i = 0; i < pelaaja.size(); i++)
                if (pelaaja.get(i).getNimi().equals(nimi)) {
                    pelaaja.remove(i);
                }
            System.out.println("");
            System.out.println("Pelaaja poistettu!");
            System.out.println("");
        }

    }

    public void tulostaPelaajat() {
        if (pelaaja.isEmpty()) {
            System.out.println("");
            System.out.println("Ei pelaajia!");
            System.out.println("");
        } else {
            System.out.println("------Pelaajat------");
            for (Pelaaja pelaaja1 : pelaaja) {
                System.out.println(pelaaja1.getNimi());
            }
            System.out.println("--------------------");
            System.out.println("");
        }
    }

    public void lisaaTulos(int pelaaja1, int indeksi, int tulos) {

        pelaaja.get(pelaaja1).lisaaPisteita(indeksi, tulos);

    }

    public void lisaaPelaaja(String nimi) {
        Pelaaja pelaaja = new Pelaaja(nimi);
        this.pelaaja.add(pelaaja);
        System.out.println("\nPelaaja " + nimi + " lisätty.\n");

    }

    public void tulostaPisteet() {
        System.out.println("_____________");
        System.out.println("");
        System.out.println("Pistetilanne");
        System.out.println("_____________");
        System.out.println("");
        for (Pelaaja pelaaja1 : pelaaja) {
            pelaaja1.getPoytakirja().laskePisteet();
            System.out.println(pelaaja1.getNimi() + ": " + pelaaja1.getPoytakirja().pisteet[1] + " pistettä.");
        }
        System.out.println("_____________");
        System.out.println("");
    }

    public String tulostaVoittaja() {
        int indeksi = 0;
        Pelaaja voittaja = pelaaja.get(indeksi);
        for (int i = 0; i < pelaaja.size(); i++) {
            pelaaja.get(indeksi).getPoytakirja().laskePisteet();
            pelaaja.get(i).getPoytakirja().laskePisteet();
            if (pelaaja.get(i).getPoytakirja().pisteet[1] > voittaja.getPoytakirja().pisteet[1]) {
                voittaja = pelaaja.get(i);
            }

        }
        return "Pelin voittaja: " + voittaja.getNimi() + "\nYhteispistein: " + voittaja.getPoytakirja().pisteet[1];

    }

}
