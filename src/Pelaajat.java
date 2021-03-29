import java.util.ArrayList;

public class Pelaajat {

    public ArrayList<Pelaaja> pelaajat;

    public Pelaajat() {
        this.pelaajat = new ArrayList<Pelaaja>();
    }

    public void poistaPelaaja(String nimi) {
        if (pelaajat.isEmpty()) {
            System.out.println("");
            System.out.println("Ei pelaajia!");
            System.out.println("");
        } else {
            for (int i = 0; i < pelaajat.size(); i++)
                if (pelaajat.get(i).getNimi().equals(nimi)) {
                    pelaajat.remove(i);
                }
            System.out.println("");
            System.out.println("Pelaaja poistettu!");
            System.out.println("");
        }

    }

    public void tulostaPelaaja(String nimi) {
        for (Pelaaja pelaaja : pelaajat) {
            if (nimi.equalsIgnoreCase(pelaaja.getNimi())) {
                pelaaja.getPoytakirja().laskePisteet();
                System.out.println("--------------------------------------------");
                System.out.println("Pelaajan " + pelaaja.getNimi() + " kortti:");
                System.out.println("--------------------------------------------");
                pelaaja.getPoytakirja().tulostaKortti();

            }
        }
    }

    public void tulostaPelaajat() {
        if (pelaajat.isEmpty()) {
            System.out.println("");
            System.out.println("Ei pelaajia!");
            System.out.println("");
        } else {
            System.out.println("------Pelaajat------");
            for (Pelaaja pelaaja : pelaajat) {
                System.out.println(pelaaja.getNimi());
            }
        }
    }

    public void lisaaTulos(int pelaaja, int indeksi, int tulos) {

        pelaajat.get(pelaaja).getPoytakirja().lisaaPisteita(indeksi, tulos);

    }

    public void lisaaPelaaja(String nimi) {
        Pelaaja pelaaja = new Pelaaja(nimi);
        this.pelaajat.add(pelaaja);
        System.out.println("");
        System.out.println("Pelaaja lisätty");
        System.out.println("");
    }

    public void tulostaPisteet() {
        System.out.println("_____________");
        System.out.println("");
        System.out.println("Pistetilanne");
        System.out.println("_____________");
        System.out.println("");
        for (Pelaaja pelaaja : pelaajat) {
            pelaaja.getPoytakirja().laskePisteet();
            System.out.println(pelaaja.getNimi() + ": " + pelaaja.getPoytakirja().pisteet[1] + " pistettä.");
        }
        System.out.println("_____________");
        System.out.println("");
    }

    public String tulostaVoittaja() {
        int indeksi = 0;
        Pelaaja voittaja = pelaajat.get(indeksi);
        for (int i = 0; i < pelaajat.size(); i++) {
            pelaajat.get(indeksi).getPoytakirja().laskePisteet();
            pelaajat.get(i).getPoytakirja().laskePisteet();
            if (pelaajat.get(i).getPoytakirja().pisteet[1] > voittaja.getPoytakirja().pisteet[1]) {
                voittaja = pelaajat.get(i);
            }

        }
        return "Pelin voittaja: " + voittaja.getNimi() + "\nYhteispistein: " + voittaja.getPoytakirja().pisteet[1];

    }

}
