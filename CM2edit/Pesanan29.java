package CM2edit;

public class Pesanan29 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan29(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;

    }
    public void tampil() {
        System.out.println(kodePesanan + "\t" + namaPesanan + "\t" + harga);
    }
    public String getNamaPesanan() { 
        return namaPesanan; 
    }
}
