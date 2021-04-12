import javax.swing.text.TabExpander;

public class Pelaaja {
    private String nimi;
    private Poytakirja poytakirja;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.poytakirja = new Poytakirja();

    }

    public void lisaaPisteita(int indeksi, int tulos) {
        System.out.println("Lisätään pisteet kohtaan | " + this.poytakirja.yhdistelmat[indeksi] + ": " + tulos + " |");
        this.poytakirja.lisaaPisteita(indeksi, tulos);
    }

    public void tulostaKortti() {
        System.out.println("--------------------------");
        System.out.println("Pelaajan " + getNimi() + " kortti:");
        System.out.println("--------------------------");

        this.poytakirja.tulostaKortti();
    }

    public boolean onkoPoytakirjaTaynna() {
        boolean taytetty;
        for (int i = 0; i < 15; i++) {
            if (poytakirja.maara[i] == -1) {
                taytetty = false;
                System.out.println("ei täynnä");
                return taytetty;
            }
        }
        taytetty = true;
        System.out.println("täynnä");
        return taytetty;

    }

    public boolean onkoTaytetty(int indeksi) {
        if (this.poytakirja.maara[indeksi] == -1) {
            return false;
        } else {
            return true;
        }
    }

    public String getNimi() {
        return nimi;
    }

    public Poytakirja getPoytakirja() {
        return poytakirja;
    }
}
