package CaseMethod1;

public class Buku {
    String kodebuku;
    String judul;
    int tahunterbit;

    Buku(){

    }

    Buku(String kb, String jd, int tht){
        kodebuku = kb;
        judul = jd;
        tahunterbit = tht;
    }

    void tampilBuku(){
        System.out.println(kodebuku + "\t" + judul + "\t" + tahunterbit);
    }
}
