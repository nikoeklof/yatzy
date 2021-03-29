import java.util.Scanner;

public class Peli {

    public void kaynnistaPeli(Pelaajat pelaajat, Scanner lukija) {
        Pelaajat pelaavat = new Pelaajat();

        for (Pelaaja pelaaja : pelaajat.pelaajat) {
            pelaavat.lisaaPelaaja(pelaaja.getNimi());
        }
        while (true) {
            for (int era = 1; era < 16; era++) {

                if (!(era == 15)) {
                    System.out.println("______________");
                    System.out.println("");
                    System.out.println((era) + " erä:");
                    System.out.println("______________");
                    System.out.println("");
                    for (int i = 0; i < pelaavat.pelaajat.size(); i++) {

                        if (i > pelaavat.pelaajat.size()) {
                            i = 0;

                        } else {

                            System.out.println("Pelaajan " + pelaavat.pelaajat.get(i).getNimi() + " vuoro:");
                            System.out.println("");
                            while (true) {
                                System.out.println("Katsotaanko kortti vai heitetäänkö nopat?");
                                System.out.println("Kortti - tulostaa kortin");
                                System.out.println("Heita - heittää nopat ja aloittaa vuoron");
                                String vastaus = lukija.nextLine();
                                if (vastaus.equalsIgnoreCase("kortti")) {
                                    pelaavat.pelaajat.get(i).getPoytakirja().tulostaKortti();
                                } else if (vastaus.equalsIgnoreCase("heita")) {
                                    break;
                                } else {
                                    System.out.println("Virheellinen syöttö");
                                }
                            }
                            pelaavat.pelaajat.get(i).getNopat().heitaNoppa();
                            System.out.println("Lisätään pisteet kohtaan: "
                                    + pelaavat.pelaajat.get(i).getPoytakirja()
                                            .getYhdistelma(pelaavat.pelaajat.get(i).getNopat().palautaTulos()[0])
                                    + ": " + pelaavat.pelaajat.get(i).getNopat().palautaTulos()[1]);
                            pelaavat.pelaajat.get(i).lisaaPisteita();
                        }
                    }
                } else if (era == 15) {
                    System.out.println("______________");
                    System.out.println("");
                    System.out.println("Viimeinen erä:");
                    System.out.println("______________");
                    System.out.println("");
                    for (int i = 0; i < pelaavat.pelaajat.size(); i++) {

                        System.out.println("Pelaajan " + pelaavat.pelaajat.get(i).getNimi() + " vuoro:");
                        while (true) {
                            System.out.println("Katsotaanko kortti vai heitetäänkö nopat?");
                            System.out.println("Kortti - tulostaa kortin");
                            System.out.println("Heitä - heittää nopat ja aloittaa vuoron");
                            String vastaus = lukija.nextLine();
                            if (vastaus.equalsIgnoreCase("kortti")) {
                                pelaavat.pelaajat.get(i).getPoytakirja().tulostaKortti();
                            } else if (vastaus.equalsIgnoreCase("heita")) {
                                break;
                            } else {
                                System.out.println("Virheellinen syöttö");
                            }
                        }
                        pelaavat.pelaajat.get(i).getNopat().heitaNoppa();

                        System.out.println("Lisätään pisteet kohtaan: "
                                + pelaavat.pelaajat.get(i).getPoytakirja()
                                        .getYhdistelma(pelaavat.pelaajat.get(i).getNopat().palautaTulos()[0])
                                + ": " + pelaavat.pelaajat.get(i).getNopat().palautaTulos()[1]);
                        pelaavat.pelaajat.get(i).lisaaPisteita();

                    }
                }
            }
            System.out.println("---------------");
            System.out.println("Peli päättyi!");
            System.out.println("---------------");
            System.out.println(pelaavat.tulostaVoittaja());
            System.out.println("---------------");
            pelaavat.pelaajat.clear();
            break;
        }

    }
}
