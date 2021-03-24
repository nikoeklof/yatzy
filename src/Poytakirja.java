public class Poytakirja {

    String[] yhdistelmat = { "Ykköset", "Kakkoset", "Kolmoset", "Neloset", "Vitoset", "Kutoset", "Pari", "Kaksi paria",
            "Kolmoisluku", "Neloisluku", "Pieni suora", "Suuri suora", "Täyskäsi (Mökki)", "Sattuma", "Yatzy" };
    int[] maara = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] pisteet = new int[2]; // tässä jonossa on valisumma (indeksi 0), ja loppusumma (indeksi 1).

    public Poytakirja() {

    }

    public void tulostaKortti() {

        String summa = "";
        for (int i = 0; i < 14; i++) {
            summa = Integer.toString(maara[i]);
            if (i == 5) {
                System.out.println("------------");
                System.out.println("Välisumma: " + pisteet[0]);
                System.out.println("------------");
            } else {
                System.out.println(yhdistelmat[i] + ": " + summa);
            }

        }
        System.out.println("------------");
        System.out.println("Summa: " + pisteet[1]);
        System.out.println("------------");
    }

    public int[] laskePisteet() {
        // täällä lasketaan pöytäkirjan pisteet ja katsotaan saako pelaaja bonuspisteitä
        // yms.
        int summa = 0;
        int valiSumma = 0;

        for (int i = 0; i < 14; i++) {
            summa += maara[i];
            if (i == 5 && summa >= 63) {
                valiSumma = summa;
                summa += 50;

            } else if (i == 5) {
                valiSumma = summa;
            }

            pisteet[0] = valiSumma;
            pisteet[1] = summa;
        }
        return pisteet;
    }

}