package Pertemuan12;

public class Kemahasiswaan29 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Kemahasiswaan29(){

    }
    Kemahasiswaan29(String nim, String nama, String kls,  double ip){
        this.nim = nim;
        this.nama = nama;
        kelas = kls;
        ipk = ip;

    }

     void tampilInformasi(){
        System.out.println("NIM \t: " + nim);
        System.out.println("NAMA \t: " + nama);
        System.out.println("KELAS \t: " + kelas);
        System.out.println("IPK \t: " + ipk);
        System.out.println("-----------------------------");
    }

}
