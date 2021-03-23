public class Noppa {
    int luku;

    public void heita() {
        luku = (int) (Math.random() * 6 + 1);
    }

    public int getLuku() {
        return luku;
    }

    @Override
    public String toString() {
        return Integer.toString(luku);
    }

}
