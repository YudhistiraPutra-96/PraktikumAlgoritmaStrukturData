package jobsheet6;

public class Mahasiswa29 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa29(){

    }

    Mahasiswa29(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampil(){
        System.out.println("NIM \t: " + nim);
        System.out.println("NAMA \t: " + nama);
        System.out.println("KELAS \t: " + kelas);
        System.out.println("IPK \t: " + ipk);
    }
}
