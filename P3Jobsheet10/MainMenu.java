package P3Jobsheet10;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        // Jumlah antrian maksimal 10
        AntrianKRS antrian = new AntrianKRS(10);
        
        int pilihan;
        
        do {
            System.out.println("----------------------------------------------");
            System.out.println("SISTEM ANTRIAN KRS MAHASISWA - DPA");
            System.out.println("----------------------------------------------");
            System.out.println("1. Tambah Antrian Mahasiswa ");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Apakah Antrian Kosong");
            System.out.println("7. Cek Apakah Antrian Penuh");
            System.out.println("8. Cetak Jumlah Antrian Saat Ini");
            System.out.println("9. Cetak Jumlah Sudah Proses KRS");
            System.out.println("10. Cetak Sisa Belum Proses KRS");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- DATA MAHASISWA ---");
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                    
                case 2:
                    antrian.prosesKRS();
                    break;
                    
                case 3:
                    antrian.tampilkanSemua();
                    break;
                    
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                    
                case 5:
                    antrian.tampilkanPalingAkhir();
                    break;
                    
                case 6:
                    if (antrian.IsEmpty()) {
                        System.out.println("Status: Antrian KOSONG");
                    } else {
                        System.out.println("Status: Antrian TIDAK KOSONG (isi: " + antrian.getJumlahAntrian() + ")");
                    }
                    break;
                    
                case 7:
                    if (antrian.IsFull()) {
                        System.out.println("Status: Antrian PENUH (maksimal 10 mahasiswa)");
                    } else {
                        System.out.println("Status: Antrian TIDAK PENUH (sisa: " + (10 - antrian.getJumlahAntrian()) + ")");
                    }
                    break;
                    
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                    
                case 9:
                    System.out.println("Jumlah mahasiswa yang sudah diproses KRS: " + antrian.getJumlahDiproses());
                    break;
                    
                case 10:
                    int sisa = antrian.getSisaBelumProses();
                    if (sisa > 0) {
                        System.out.println("Sisa kuota DPA (belum proses KRS): " + sisa + " mahasiswa");
                    } else {
                        System.out.println("Kuota DPA sudah habis! Semua 30 mahasiswa sudah diproses.");
                    }
                    break;
                    
                case 11:
                    antrian.clear();
                    break;
                    
                case 0:
                    System.out.println("\nTerima kasih telah menggunakan sistem antrian KRS!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}
