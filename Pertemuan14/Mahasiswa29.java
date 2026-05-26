package Pertemuan14;

public class Mahasiswa29 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa29(){

    }

    public Mahasiswa29(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.println("NIM : " + this.nim + " "+
        "NAMA : " + this.nama + " "+    
        "KELAS : " + this.kelas + " "+    
        "IPK : " + this.ipk);
    }
}
