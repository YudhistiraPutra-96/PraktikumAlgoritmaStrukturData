package jobsheet02;

public class Dosen29 {
   String idDosen;
   String nama;
   boolean statusAktif;
   int tahunBergabung;
   String bidangKeahlian;
   
   public Dosen29(){

   }

   public Dosen29(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
    this.idDosen = idDosen;
    this.nama = nama;
    this.statusAktif = statusAktif;
    this.tahunBergabung = tahunBergabung;
    this.bidangKeahlian = bidangKeahlian;
   }

   void tampilInformasi(){
    System.out.println("ID Dosen : " + idDosen);
    System.out.println("Nama : " + nama);
    System.out.println("Status Aktif : " + statusAktif);
    System.out.println("Tahun Bergabung : " + tahunBergabung);
    System.out.println("Bidang Keahlian Dosen : " + bidangKeahlian);
   }

   void setStatusAktif(boolean status){
    statusAktif = status;
    System.out.println("Status Dosen saat ini : " + status);
   }

   int hitungMasaKerja(int thnSkrg){
    return thnSkrg - tahunBergabung;
   }

   void ubahKeahlian(String bidang){
    bidangKeahlian = bidang;
    System.out.println("Bidang Keahlian diubah menjadi : " + bidangKeahlian);
   }
}
