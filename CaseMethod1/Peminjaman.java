package CaseMethod1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam ;
    int batasPinjam = 5;
    int terlambat;
    int denda = 2000; 

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda(){
        if (lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * denda;
        }else{
            terlambat = 0;
            denda = 0;
        }
       
    }

    void tampilPeminjaman(){
        System.out.println("Nama Peminjam \t\t\t: " + mhs.nama );
        System.out.println("Judul Buku yang dipinjam \t: " + buku.judul );
        System.out.println("Lama Peminjaman \t\t: " + lamaPinjam );
        System.out.println("Terlambat selama \t\t: " + terlambat + " hari" );
        System.out.println("Total Denda \t\t\t: Rp." + denda );
        System.out.println("================================================================");
    }
}
