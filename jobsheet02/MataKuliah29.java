package jobsheet02;

public class MataKuliah29 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah29(){

    }

    public MataKuliah29(String kodeMK,String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }

    void tampilInformasi(){
        System.out.println("Kode MataKuliah : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("Total SKS : " + sks);
        System.out.println("Jumlah Jam MataKuliah : " + jumlahJam);
    }

    void ubahSKS (int sksBaru){
        sks = sksBaru;
        System.out.println("Jumlah SKS terbaru : " + sks);
    }
    void tambahJam (int jam){
        jumlahJam += jam;
        System.out.println("Total jam : "+ jumlahJam);
    }

    void kurangiJam(int jam){
        if (jumlahJam >= jam){
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi menjadi : " + jumlahJam);
        }else {
            System.out.println("Jumlah jam tidak dapat dikurangi");
        }
        
    }
}
