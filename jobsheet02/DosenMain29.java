package jobsheet02;

public class DosenMain29 {
    public static void main(String[] args) {
        
        Dosen29 dsn1 = new Dosen29();
        dsn1.idDosen = "384713701293";
        dsn1.nama = "Suharto";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2000;
        dsn1.bidangKeahlian = "MTK";

        System.out.println("Dosen 1");
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.ubahKeahlian("Pecel Lele");

        Dosen29 dsn2 = new Dosen29("384719234","Sukarno",true, 2015, "Basis Data");
        System.out.println("Dosen 2");
        dsn2.tampilInformasi();
        dsn2.ubahKeahlian("ayam geprek");
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
    }
}
