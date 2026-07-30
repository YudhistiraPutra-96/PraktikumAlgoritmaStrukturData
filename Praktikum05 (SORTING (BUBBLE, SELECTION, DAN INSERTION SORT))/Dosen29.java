package Praktikum05;

public class Dosen29 {
    String kode;
    String nama;
    boolean jeniskelamin;
    int usia;

    Dosen29() {
    }

    Dosen29 (String kd, String nm, boolean jk, int usia){
        kode = kd;
        nama = nm;
        jeniskelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + (jeniskelamin ? "L" : "P"));
        System.out.println("Usia : " + usia);
    }

}
