package CaseMethod1;

public class Buku {
    String kodebuku;
    String judul;
    int tahunterbit;

    Buku(){

    }

    Buku(String kode, String judul, int tahun){
        kodebuku = kode;
        this.judul = judul;
        tahunterbit = tahun;
    }

    void tampilBuku(){
        System.out.println(kodebuku + "\t" + judul + "\t\t" + tahunterbit);
    }
}
