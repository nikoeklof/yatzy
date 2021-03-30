import java.util.Scanner;

public class Peli {

    public void kaynnistaPeli(Pelaajat pelaajat, Scanner lukija) {
        Pelaajat pelaavat = new Pelaajat();

        for (Pelaaja pelaaja : pelaajat.pelaajat) {
            pelaavat.lisaaPelaaja(pelaaja.getNimi());
        }
        System.out.println("Devi?");
        String devi = lukija.nextLine();
        if (devi.equalsIgnoreCase("kylla")) {
            while (true) {
                int era = 15;
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
                            System.out.println("");
                            System.out.println("----");
                            System.out.println("Pelaajan " + pelaavat.pelaajat.get(i).getNimi() + " vuoro:");
                            System.out.println("----");
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
                            if (pelaavat.pelaajat.get(i).getPoytakirja().maara[pelaavat.pelaajat.get(i).getNopat()
                                    .palautaTulos()[0]] == 0) {
                                System.out.println("Lisätään pisteet kohtaan: "
                                        + pelaavat.pelaajat.get(i).getPoytakirja()
                                                .getYhdistelma(pelaavat.pelaajat.get(i).getNopat().palautaTulos()[0])
                                        + " = " + pelaavat.pelaajat.get(i).getNopat().palautaTulos()[1]);
                                pelaavat.pelaajat.get(i).lisaaPisteita();
                            } else {
                                System.out.println("-----------");
                                System.out.println("Yhdistelmä on jo käytetty! valitse toinen");
                                System.out.println("-----------");
                                System.out.println("");
                                int noppa1 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[0]);
                                int noppa2 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[1]);
                                int noppa3 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[2]);
                                int noppa4 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[3]);
                                int noppa5 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[4]);
                                pelaavat.pelaajat.get(i).getNopat().noppienTulos(noppa1, noppa2, noppa3, noppa4, noppa5,
                                        lukija);

                            }
                        }
                    }
                } else if (era == 15) {

                    System.out.println("______________");
                    System.out.println("");
                    System.out.println("Viimeinen erä:");
                    System.out.println("______________");
                    System.out.println("");
                    for (int i = 0; i < pelaavat.pelaajat.size(); i++) {

                        System.out.println("");
                        System.out.println("----");
                        System.out.println("Pelaajan " + pelaavat.pelaajat.get(i).getNimi() + " vuoro:");
                        System.out.println("----");
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
                        if (pelaavat.pelaajat.get(i).getPoytakirja().maara[pelaavat.pelaajat.get(i).getNopat()
                                .palautaTulos()[0]] == 0) {
                            System.out.println("Lisätään pisteet kohtaan: "
                                    + pelaavat.pelaajat.get(i).getPoytakirja()
                                            .getYhdistelma(pelaavat.pelaajat.get(i).getNopat().palautaTulos()[0])
                                    + " = " + pelaavat.pelaajat.get(i).getNopat().palautaTulos()[1]);
                            pelaavat.pelaajat.get(i).lisaaPisteita();
                        } else {
                            System.out.println("-----------");
                            System.out.println("Yhdistelmä on jo käytetty! valitse toinen");
                            System.out.println("-----------");
                            System.out.println("");
                            int noppa1 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[0]);
                            int noppa2 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[1]);
                            int noppa3 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[2]);
                            int noppa4 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[3]);
                            int noppa5 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[4]);
                            pelaavat.pelaajat.get(i).getNopat().noppienTulos(noppa1, noppa2, noppa3, noppa4, noppa5,
                                    lukija);

                        }
                    }
                }
                System.out.println("***************");
                System.out.println("Peli päättyi!");
                System.out.println("***************");
                System.out.println(pelaavat.tulostaVoittaja());
                System.out.println("***************");
                pelaavat.pelaajat.clear();
                break;
            }

        } else {
            while (true) {
                for (int era = 1; era != 15; era++) {

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

                                System.out.println("");
                                System.out.println("----");
                                System.out.println("Pelaajan " + pelaavat.pelaajat.get(i).getNimi() + " vuoro:");
                                System.out.println("----");
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
                                if (pelaavat.pelaajat.get(i).getPoytakirja().maara[pelaavat.pelaajat.get(i).getNopat()
                                        .palautaTulos()[0]] == 0) {
                                    System.out
                                            .println(
                                                    "Lisätään pisteet kohtaan: "
                                                            + pelaavat.pelaajat.get(i).getPoytakirja()
                                                                    .getYhdistelma(pelaavat.pelaajat.get(i).getNopat()
                                                                            .palautaTulos()[0])
                                                            + " = "
                                                            + pelaavat.pelaajat.get(i).getNopat().palautaTulos()[1]);
                                    pelaavat.pelaajat.get(i).lisaaPisteita();
                                } else {
                                    System.out.println("-----------");
                                    System.out.println("Yhdistelmä on jo käytetty! valitse toinen");
                                    System.out.println("-----------");
                                    System.out.println("");
                                    int noppa1 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[0]);
                                    int noppa2 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[1]);
                                    int noppa3 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[2]);
                                    int noppa4 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[3]);
                                    int noppa5 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[4]);
                                    pelaavat.pelaajat.get(i).getNopat().noppienTulos(noppa1, noppa2, noppa3, noppa4,
                                            noppa5, lukija);

                                }
                            }
                        }
                    } else if (era == 15) {
                        System.out.println("______________");
                        System.out.println("");
                        System.out.println("Viimeinen erä:");
                        System.out.println("______________");
                        System.out.println("");
                        for (int i = 0; i < pelaavat.pelaajat.size(); i++) {

                            System.out.println("");
                            System.out.println("----");
                            System.out.println("Pelaajan " + pelaavat.pelaajat.get(i).getNimi() + " vuoro:");
                            System.out.println("----");
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

                            if (pelaavat.pelaajat.get(i).getPoytakirja().maara[pelaavat.pelaajat.get(i).getNopat()
                                    .palautaTulos()[0]] == 0) {
                                System.out.println("Lisätään pisteet kohtaan: "
                                        + pelaavat.pelaajat.get(i).getPoytakirja()
                                                .getYhdistelma(pelaavat.pelaajat.get(i).getNopat().palautaTulos()[0])
                                        + " = " + pelaavat.pelaajat.get(i).getNopat().palautaTulos()[1]);
                                pelaavat.pelaajat.get(i).lisaaPisteita();
                            } else {
                                System.out.println("-----------");
                                System.out.println("Yhdistelmä on jo käytetty! valitse toinen");
                                System.out.println("-----------");
                                System.out.println("");
                                int noppa1 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[0]);
                                int noppa2 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[1]);
                                int noppa3 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[2]);
                                int noppa4 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[3]);
                                int noppa5 = Integer.valueOf(pelaavat.pelaajat.get(i).getNopat().palautaNopat()[4]);
                                pelaavat.pelaajat.get(i).getNopat().noppienTulos(noppa1, noppa2, noppa3, noppa4, noppa5,
                                        lukija);

                            }

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
}
