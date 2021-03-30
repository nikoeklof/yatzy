public class Paaohjelma {
    public static void main(String[] args) {

        Pelaajat pelaajat = new Pelaajat();
        pelaajat.lisaaPelaaja("Niko");
        pelaajat.pelaaja.get(0).tulostaKortti();
        pelaajat.lisaaTulos(0, 3, 16);
        pelaajat.pelaaja.get(0).tulostaKortti();

    }
}
