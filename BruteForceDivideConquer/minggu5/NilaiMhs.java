package BruteForceDivideConquer.minggu5;

public class NilaiMhs {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public NilaiMhs(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public int getNilaiUTS() {
        return nilaiUTS;
    }

    public int getNilaiUAS() {
        return nilaiUAS;
    }

    public String toString() {
        return String.format("%s\t%s\t%d\t\t%d\t%d", 
                nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);
    }
}
