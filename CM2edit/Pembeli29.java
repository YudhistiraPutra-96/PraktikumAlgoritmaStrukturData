package CM2edit;

public class Pembeli29 {
    int noAntrian;
    String pembeli;
    String nohp;

    public Pembeli29(int noAntrian, String pembeli, String nohp){
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.nohp = nohp;
    }

    public void tampil() {
        System.out.println(noAntrian + "\t" + pembeli + "\t" + nohp);
    }
}
