package CaseMethod1;

public class DataPeminjaman {
    Mahasiswa[] daftarMahasiswa;
    Buku[] daftarBuku;
    Peminjaman[] daftarPeminjaman;

    public DataPeminjaman(){
        daftarMahasiswa = new Mahasiswa[]{
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        daftarBuku = new Buku[]{
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        daftarPeminjaman = new Peminjaman[]{
            new Peminjaman(daftarMahasiswa[0], daftarBuku[0], 7),
            new Peminjaman(daftarMahasiswa[1], daftarBuku[1], 3),
            new Peminjaman(daftarMahasiswa[2], daftarBuku[2], 10),
            new Peminjaman(daftarMahasiswa[2], daftarBuku[3], 6),
            new Peminjaman(daftarMahasiswa[0], daftarBuku[1], 4)
        };    
    }

    void tampilMahasiswa() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM\tNama\tProdi");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            daftarMahasiswa[i].tampilMahasiswa();
        }
    }

    void tampilBuku() {
        System.out.println("\n=== DATA BUKU ===");
        System.out.println("Kode\tJudul\tTahun");
        for (int i = 0; i < daftarBuku.length; i++) {
            daftarBuku[i].tampilBuku();
        }
    }

    void tampilPeminjaman() {
        System.out.println("=== DATA PEMINJAMAN ===");
        for (int i = 0; i < daftarPeminjaman.length; i++) {
            daftarPeminjaman[i].tampilPeminjaman();
        }
    }

    void urutkanbedasarkantahunterbit(){
            for (int i = 1; i <= daftarBuku.length-1; i++) {
            Buku temp = daftarBuku[i];
            int j = i - 1;
            while (j >= 0 && daftarBuku[j].tahunterbit < temp.tahunterbit) {
                daftarBuku[j + 1] = daftarBuku[j];
                j--;
            }
            daftarBuku[j + 1] = temp;
        }
        System.out.println("=== SETELAH DIURUTKAN (Bedasarkan tahun terbit) ===");
        for( int i = 0; i < daftarBuku.length; i++){
            daftarBuku[i].tampilBuku();
        }
    }

    void urutkanbedasarkandenda(){
            for (int i = 1; i <= daftarPeminjaman.length-1; i++) {
            Peminjaman temp = daftarPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && daftarPeminjaman[j].denda < temp.denda) {
                daftarPeminjaman[j + 1] = daftarPeminjaman[j];
                j--;
            }
            daftarPeminjaman[j + 1] = temp;
        }
        System.out.println("=== SETELAH DIURUTKAN (Denda Terbesar) ===");
        for( int i = 0; i < daftarPeminjaman.length; i++){
            daftarPeminjaman[i].tampilPeminjaman();
        }
    }

    int findBinarySearch(String cariNIM, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            int compare = daftarPeminjaman[mid].mhs.nim.compareTo(cariNIM);
            
            if (compare == 0) {
                return mid; 
            } else if (compare > 0) {
                return findBinarySearch(cariNIM, left, mid - 1);
            } else {
                return findBinarySearch(cariNIM, mid + 1, right);
            }
        }
        return -1;
    }

   void cariBerdasarkanNIM(String cariNIM) {
        for (int i = 1; i < daftarPeminjaman.length; i++) {
            Peminjaman key = daftarPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && daftarPeminjaman[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                daftarPeminjaman[j + 1] = daftarPeminjaman[j];
                j--;
            }
            daftarPeminjaman[j + 1] = key;
        }

        int KetemuNIM = findBinarySearch(cariNIM, 0, daftarPeminjaman.length - 1);

        System.out.println("\n=== HASIL PENCARIAN NIM: " + cariNIM + " ===");
        if (KetemuNIM == -1) {
            System.out.println("Data dengan NIM " + cariNIM + " tidak ditemukan.");
        } else {
            for (int i = KetemuNIM; i >= 0 && daftarPeminjaman[i].mhs.nim.equals(cariNIM); i--) {
                daftarPeminjaman[i].tampilPeminjaman();
            }
            for (int i = KetemuNIM + 1; i < daftarPeminjaman.length && daftarPeminjaman[i].mhs.nim.equals(cariNIM); i++) {
                daftarPeminjaman[i].tampilPeminjaman();
            }
        }
    }
}
