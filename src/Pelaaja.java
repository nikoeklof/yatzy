public class Pelaaja {
    private String nimi;
    private Nopat nopat;
    private Poytakirja poytakirja;
    int[] x;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.nopat = new Nopat();
        this.poytakirja = new Poytakirja();

    }

    public void lisaaPisteita() {
        int[] x = new int[2];
        x = this.nopat.palautaTulos();
        int indeksi = Integer.valueOf(x[0]);
        int tulos = Integer.valueOf(x[1]);
        if (this.poytakirja.maara[indeksi] == 0) {
            this.poytakirja.lisaaPisteita(indeksi, tulos);
        } else {
            System.out.println("Jotain vialla luokassa Pelaaja.....");
        }
    }

    public void heitaNoppa() {
        this.nopat.heitaNoppa();
    }

    public String getNimi() {
        return nimi;
    }

    public Nopat getNopat() {
        return nopat;
    }

    public Poytakirja getPoytakirja() {
        return poytakirja;
    }
}
