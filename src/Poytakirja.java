public class Poytakirja {

    String[] yhdistelmat = { "Ykköset", "Kakkoset", "Kolmoset", "Neloset", "Vitoset", "Kutoset", "Pari", "Kaksi paria",
            "Kolmoisluku", "Neloisluku", "Pieni suora", "Suuri suora", "Täyskäsi (Mökki)", "Sattuma", "Yatzy" };
    int[] maara = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public void tulostaKortti() {
        String summa = "";
        for (int i = 0; i < 15; i++) {
            summa = Integer.toString(maara[i]);
            if (summa.equals("0")) {
                summa = "0";
            }
            System.out.println(yhdistelmat[i] + ": " + summa);
        }
    }

}