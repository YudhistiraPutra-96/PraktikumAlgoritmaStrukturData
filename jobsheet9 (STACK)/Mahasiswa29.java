package jobsheet9;

public class Mahasiswa29 {
    String nim;
    String kelas;
    String nama;
    int nilai;

    Mahasiswa29(){

    }

    Mahasiswa29(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
