import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Nopat {

    int[] x;

    public Nopat() {

    }

    public int[] palautaTulos() {

        int[] y = new int[2];
        y = this.x;
        return y;
    }

    public void heitaNoppa() {

        Random random = new Random();
        Scanner lukija = new Scanner(System.in);

        boolean pisteetValittu = false;
        this.x = new int[2];
        int vuorot = 2;

        System.out.println("Heitetään 5 noppaa...");

        int noppa01 = 1 + random.nextInt(6);
        int noppa02 = 1 + random.nextInt(6);
        int noppa03 = 1 + random.nextInt(6);
        int noppa04 = 1 + random.nextInt(6);
        int noppa05 = 1 + random.nextInt(6);

        while (true) {

            System.out.println("1: " + noppa01);
            System.out.println("2: " + noppa02);
            System.out.println("3: " + noppa03);
            System.out.println("4: " + noppa04);
            System.out.println("5: " + noppa05);
            System.out.println("Vuoroja: " + vuorot);

            System.out.println("heita = heittää uuestaan valitut nopat");
            System.out.println("check = tarkistaa avoimet noppa yhistelmät");
            String vastaus = lukija.nextLine();

            if (vastaus.equals("heita") && vuorot == 0) {

                System.out.println("Sinulla ei ole enään vuoroja...");

            } else if (vastaus.equals("heita") && vuorot > 0) {

                int heittoja = 0;
                int uusi01 = 0;
                int uusi02 = 0;
                int uusi03 = 0;
                int uusi04 = 0;

                vuorot--;

                System.out.println("Kuinka monta noppaa haluat heittää?");
                while (true) {
                    heittoja = Integer.valueOf(lukija.nextLine());

                    if (heittoja > 5 || heittoja < 1) {
                        System.out.print("Virheellinen luku...");
                    } else {
                        break;
                    }
                }

                if (heittoja != 5) {

                    System.out.println("Mitkä nopat heitetään uusiksi?");
                    System.out.println("Huom! valitse nopat yksitellen");

                    while (true) {
                        uusi01 = Integer.valueOf(lukija.nextLine());

                        if (uusi01 < 1 || uusi01 > 5) {
                            System.out.print("Numero on liias suuri tai pieni...   ");
                        } else {
                            break;
                        }

                    }

                    if (heittoja >= 2) {
                        while (true) {
                            uusi02 = Integer.valueOf(lukija.nextLine());
                            if (uusi02 == uusi01 || uusi02 < 1 || uusi02 > 5) {
                                System.out.print("Sama kuin aikasempi tai numero on liias suuri tai pieni...   ");
                            } else {
                                break;
                            }
                        }
                    }
                    if (heittoja >= 3) {
                        while (true) {
                            uusi03 = Integer.valueOf(lukija.nextLine());
                            if (uusi03 == uusi01 || uusi03 == uusi02 || uusi03 < 1 || uusi03 > 5) {
                                System.out.print("Sama kuin aikasempi tai numero on liias suuri tai pieni...   ");
                            } else {
                                break;
                            }
                        }
                    }
                    if (heittoja == 4) {
                        while (true) {
                            uusi04 = Integer.valueOf(lukija.nextLine());
                            if (uusi04 == uusi01 || uusi04 == uusi02 || uusi04 == uusi03 || uusi04 < 1 || uusi04 > 5) {
                                System.out.print("Sama kuin aikasempi tai numero on liias suuri tai pieni...   ");
                            } else {
                                break;
                            }
                        }
                    }
                }
                if (heittoja == 5) {
                    noppa01 = 1 + random.nextInt(6);
                    noppa02 = 1 + random.nextInt(6);
                    noppa03 = 1 + random.nextInt(6);
                    noppa04 = 1 + random.nextInt(6);
                    noppa05 = 1 + random.nextInt(6);
                }

                switch (uusi01) {

                case 1:

                    noppa01 = 1 + random.nextInt(6);
                    break;

                case 2:

                    noppa02 = 1 + random.nextInt(6);
                    break;

                case 3:

                    noppa03 = 1 + random.nextInt(6);
                    break;

                case 4:

                    noppa04 = 1 + random.nextInt(6);
                    break;

                case 5:

                    noppa05 = 1 + random.nextInt(6);
                    break;

                }

                if (heittoja >= 2) {

                    switch (uusi02) {

                    case 1:

                        noppa01 = 1 + random.nextInt(6);
                        break;

                    case 2:

                        noppa02 = 1 + random.nextInt(6);
                        break;

                    case 3:

                        noppa03 = 1 + random.nextInt(6);
                        break;

                    case 4:

                        noppa04 = 1 + random.nextInt(6);
                        break;

                    case 5:

                        noppa05 = 1 + random.nextInt(6);
                        break;

                    }
                }

                if (heittoja >= 3) {

                    switch (uusi03) {

                    case 1:

                        noppa01 = 1 + random.nextInt(6);
                        break;

                    case 2:

                        noppa02 = 1 + random.nextInt(6);
                        break;

                    case 3:

                        noppa03 = 1 + random.nextInt(6);
                        break;

                    case 4:

                        noppa04 = 1 + random.nextInt(6);
                        break;

                    case 5:

                        noppa05 = 1 + random.nextInt(6);
                        break;

                    }
                }

                if (heittoja >= 4) {

                    switch (uusi04) {

                    case 1:

                        noppa01 = 1 + random.nextInt(6);
                        break;

                    case 2:

                        noppa02 = 1 + random.nextInt(6);
                        break;

                    case 3:

                        noppa03 = 1 + random.nextInt(6);
                        break;

                    case 4:

                        noppa04 = 1 + random.nextInt(6);
                        break;

                    case 5:

                        noppa05 = 1 + random.nextInt(6);
                        break;

                    }

                }

            } else if (vastaus.equals("check")) {

                while (true) {

                    x = noppienTulos(noppa01, noppa02, noppa03, noppa04, noppa05, lukija);

                    if (x[1] == 0 && vuorot == 0) {
                        System.out.print("Oletko varma? Sinulla ei ole enään vuoroja... yay vai nay");
                        while (true) {
                            String viimeinen = lukija.nextLine();
                            if (viimeinen.equals("yay")) {
                                pisteetValittu = true;
                            } else if (viimeinen.equals("nay")) {
                                break;
                            } else {
                                System.out.print("Virhe");
                            }
                        }
                    } else if (x[1] == 0) {
                        break;
                    } else if (x[1] > 0) {
                        pisteetValittu = true;
                    } else if (x[1] == -1) {
                        x[1] = 0;
                        pisteetValittu = true;

                    } else if (vuorot > 0) {
                        continue;
                    } else {

                        System.out.print("Virheellinen komento...   ");

                    }

                    if (pisteetValittu) {
                        break;
                    }
                }
            }
            if (pisteetValittu) {
                break;
            }
        }

        palautaTulos();

    }

    public static int[] noppienTulos(int noppa01, int noppa02, int noppa03, int noppa04, int noppa05, Scanner lukija) {

        // Spagetti koodia

        ArrayList<Integer> noppia = new ArrayList<Integer>();
        noppia.add(noppa01);
        noppia.add(noppa02);
        noppia.add(noppa03);
        noppia.add(noppa04);
        noppia.add(noppa05);
        Collections.sort(noppia);

        noppa05 = noppia.get(4);
        noppa04 = noppia.get(3);
        noppa03 = noppia.get(2);
        noppa02 = noppia.get(1);
        noppa01 = noppia.get(0);

        int i = 0;
        int ii = 0;
        int iii = 0;
        int iv = 0;
        int v = 0;
        int vi = 0;

        int ipari = 0;
        int iipari = 0;
        int trio = 0;
        int quad = 0;
        int pieniSuora15 = 15;
        int suuriSuora20 = 20;
        int taysKasiLuku = 0;
        int sattumaLuku = 0;
        int yatzy50 = 50;

        boolean ykkoset = false;
        boolean kakkoset = false;
        boolean kolmoset = false;
        boolean neloset = false;
        boolean viitoset = false;
        boolean kuutoset = false;

        boolean yksiPari = false;
        boolean kaksiParia = false;
        boolean kolmoisluku = false;
        boolean neloisluku = false;
        boolean pieniSuora = false;
        boolean suuriSuora = false;
        boolean taysKasi = false;
        boolean sattuma = false;
        boolean yatzy = false;
        int[] pisteet = new int[2];

        System.out.println("Pöytäkirjan yhdistelmät: ");

        // Perus-yhdistelmät

        // Ykköset , perus yhdistelmät pitäisi toimia myös tälläsellä loopilla
        // if (noppia.contains(1)) {
        // ykkoset = true;
        // for (Integer noppa : noppia) {
        // if (noppa == 1) {
        // i++;
        // }
        // }
        if (noppia.contains(1)) {
            ykkoset = true;

            if (noppa01 == 1) {
                i++;
            }
            if (noppa02 == 1) {
                i++;
            }
            if (noppa03 == 1) {
                i++;
            }
            if (noppa04 == 1) {
                i++;
            }
            if (noppa05 == 1) {
                i++;
            }
            System.out.println("ykkoset: " + i);
        }

        // Kakkoset

        if (noppia.contains(2))

        {
            kakkoset = true;

            if (noppa01 == 2) {
                ii++;
                ii++;
            }
            if (noppa02 == 2) {
                ii++;
                ii++;
            }
            if (noppa03 == 2) {
                ii++;
                ii++;
            }
            if (noppa04 == 2) {
                ii++;
                ii++;
            }
            if (noppa05 == 2) {
                ii++;
                ii++;
            }

            System.out.println("kakkoset: " + ii);
        }

        // Kolmoset

        if (noppia.contains(3)) {
            kolmoset = true;

            if (noppa01 == 3) {
                iii = iii + 3;
            }
            if (noppa02 == 3) {
                iii = iii + 3;
            }
            if (noppa03 == 3) {
                iii = iii + 3;
            }
            if (noppa04 == 3) {
                iii = iii + 3;
            }
            if (noppa05 == 3) {
                iii = iii + 3;
            }

            System.out.println("kolmoset: " + iii);
        }

        // Neloset

        if (noppia.contains(4)) {
            neloset = true;

            if (noppa01 == 4) {
                iv = iv + 4;
            }
            if (noppa02 == 4) {
                iv = iv + 4;
            }
            if (noppa03 == 4) {
                iv = iv + 4;
            }
            if (noppa04 == 4) {
                iv = iv + 4;
            }
            if (noppa05 == 4) {
                iv = iv + 4;
            }

            System.out.println("neloset: " + iv);
        }

        // Viitoset

        if (noppia.contains(5)) {
            viitoset = true;

            if (noppa01 == 5) {
                v = v + 5;
            }
            if (noppa02 == 5) {
                v = v + 5;
            }
            if (noppa03 == 5) {
                v = v + 5;
            }
            if (noppa04 == 5) {
                v = v + 5;
            }
            if (noppa05 == 5) {
                v = v + 5;
            }

            System.out.println("viitoset: " + v);
        }

        // Kuutoset

        if (noppia.contains(6)) {
            kuutoset = true;

            if (noppa01 == 6) {
                vi = vi + 6;
            }
            if (noppa02 == 6) {
                vi = vi + 6;
            }
            if (noppa03 == 6) {
                vi = vi + 6;
            }
            if (noppa04 == 6) {
                vi = vi + 6;
            }
            if (noppa05 == 6) {
                vi = vi + 6;
            }

            System.out.println("kuutoset: " + vi);
        }

        // Erikois-yhdistelmät

        // Yksipari

        if (noppa05 == noppa04 || noppa04 == noppa03 || noppa03 == noppa02 || noppa02 == noppa01) {
            yksiPari = true;

            if (noppa05 == noppa04) {
                ipari = noppa05 + noppa04;
            } else if (noppa04 == noppa03) {
                ipari = noppa04 + noppa03;
            } else if (noppa03 == noppa02) {
                ipari = noppa03 + noppa02;
            } else if (noppa02 == noppa01) {
                ipari = noppa02 + noppa01;
            }

            System.out.println("yksipari: " + ipari);
        }

        // Kaksiparia

        if (noppa05 == noppa04 && noppa03 == noppa02 && noppa05 != noppa03
                || noppa04 == noppa03 && noppa02 == noppa01) {
            kaksiParia = true;

            if (noppa05 == noppa04) {
                ipari = noppa05 + noppa04;
            } else if (noppa04 == noppa03) {
                ipari = noppa04 + noppa03;
            } else if (noppa03 == noppa02) {
                ipari = noppa03 + noppa02;
            } else if (noppa02 == noppa01) {
                ipari = noppa02 + noppa01;
            }

            System.out.println("kaksiparia: " + iipari);
        }

        // Kolmoisluku

        if (noppa05 == noppa04 && noppa05 == noppa03 || noppa04 == noppa03 && noppa04 == noppa02
                || noppa03 == noppa02 && noppa05 == noppa01) {
            kolmoisluku = true;

            if (noppa05 == noppa04 && noppa05 == noppa03) {
                trio = noppa05 + noppa04 + noppa03;
            } else if (noppa04 == noppa03 && noppa04 == noppa02) {
                trio = noppa04 + noppa03 + noppa02;
            } else if (noppa03 == noppa02 && noppa05 == noppa01) {
                trio = noppa03 + noppa02 + noppa01;
            }

            System.out.println("kolmoisluku: " + trio);
        }

        // Neloisluku

        if (noppa05 == noppa04 && noppa05 == noppa03 && noppa05 == noppa02
                || noppa04 == noppa03 && noppa04 == noppa02 && noppa04 == noppa01) {
            neloisluku = true;

            if (noppa05 == noppa04 && noppa05 == noppa03 && noppa05 == noppa02) {
                quad = noppa05 + noppa04 + noppa03 + noppa02;
            } else if (noppa04 == noppa03 && noppa04 == noppa02 && noppa04 == noppa01) {
                quad = noppa04 + noppa03 + noppa02 + noppa01;
            }

            System.out.println("neloisluku: " + quad);
        }

        // Pieni Suora

        if (noppa05 == 5 && noppa04 == 4 && noppa03 == 3 && noppa02 == 2 && noppa01 == 1) {
            pieniSuora = true;

            System.out.println("pienisuora: " + pieniSuora15);
        }

        // Suuri Suora

        if (noppa05 == 6 && noppa04 == 5 && noppa03 == 4 && noppa02 == 3 && noppa01 == 2) {
            suuriSuora = true;

            System.out.println("suurisuora: " + suuriSuora20);
        }

        // Täys Käsi

        if (noppa05 == noppa04 && noppa03 == noppa02 && noppa03 == noppa01 && noppa05 != noppa03
                || noppa05 == noppa04 && noppa05 == noppa03 && noppa02 == noppa01 && noppa05 != noppa02) {
            taysKasi = true;

            taysKasiLuku = noppa01 + noppa02 + noppa03 + noppa04 + noppa05;

            System.out.println("tayskasi: " + taysKasiLuku);
        }

        // Sattuma

        sattuma = true;

        sattumaLuku = noppa05 + noppa04 + noppa03 + noppa02 + noppa01;

        System.out.println("sattuma: " + sattumaLuku);

        // Yatzy

        if (noppa05 == noppa04 && noppa05 == noppa03 && noppa05 == noppa02 && noppa05 == noppa01) {
            yatzy = true;

            System.out.println("yatzy: " + yatzy50);
        }

        // Yhdistelmän valinta

        System.out.println(
                "Minkä yhdistelmän haluat käyttää? nay = ei ota mitään. lopeta = lopettaa vuoron ilman pisteitä");

        while (true) {
            String yhdistelma = lukija.nextLine();
            if (yhdistelma.equals("ykkoset") && ykkoset) {
                pisteet[0] = 0;
                pisteet[1] = i;
                break;
            } else if (yhdistelma.equals("kakkoset") && kakkoset) {
                pisteet[0] = 1;
                pisteet[1] = ii;
                break;
            } else if (yhdistelma.equals("kolmoset") && kolmoset) {
                pisteet[0] = 2;
                pisteet[1] = iii;
                break;
            } else if (yhdistelma.equals("neloset") && neloset) {
                pisteet[0] = 3;
                pisteet[1] = iv;
                break;
            } else if (yhdistelma.equals("viitoset") && viitoset) {
                pisteet[0] = 4;
                pisteet[1] = v;
                break;
            } else if (yhdistelma.equals("kuutoset") && kuutoset) {
                pisteet[0] = 5;
                pisteet[1] = vi;
                break;
            } else if (yhdistelma.equals("yksipari") && yksiPari) {
                pisteet[0] = 6;
                pisteet[1] = ipari;
                break;
            } else if (yhdistelma.equals("kaksiparia") && kaksiParia) {
                pisteet[0] = 7;
                pisteet[1] = iipari;
                break;
            } else if (yhdistelma.equals("kolmoisluku") && kolmoisluku) {
                pisteet[0] = 8;
                pisteet[1] = trio;
                break;
            } else if (yhdistelma.equals("neloisluku") && neloisluku) {
                pisteet[0] = 9;
                pisteet[1] = quad;
                break;
            } else if (yhdistelma.equals("pienisuora") && pieniSuora) {
                pisteet[0] = 10;
                pisteet[1] = pieniSuora15;
                break;
            } else if (yhdistelma.equals("suurisuora") && suuriSuora) {
                pisteet[0] = 11;
                pisteet[1] = suuriSuora20;
                break;
            } else if (yhdistelma.equals("tayskasi") && taysKasi) {
                pisteet[0] = 12;
                pisteet[1] = taysKasiLuku;
                break;
            } else if (yhdistelma.equals("sattuma") && sattuma) {
                pisteet[0] = 13;
                pisteet[1] = sattumaLuku;
                break;
            } else if (yhdistelma.equals("yatzy") && yatzy) {
                pisteet[0] = 14;
                pisteet[1] = yatzy50;
                break;
            } else if (yhdistelma.equals("nay")) {
                pisteet[1] = 0;
                break;
            } else if (yhdistelma.equals("lopeta")) {
                pisteet[1] = -1;
                break;
            } else {
                System.out.print("Virhe");
            }
        }

        return pisteet;
    }

}