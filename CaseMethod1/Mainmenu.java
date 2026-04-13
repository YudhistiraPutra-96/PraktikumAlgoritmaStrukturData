package CaseMethod1;

import java.util.Scanner;

public class Mainmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataPeminjaman data = new DataPeminjaman();
        int pilihan;

        do{
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch(pilihan){
                case 1:
                    data.tampilMahasiswa();
                    break;
                case 2:
                    data.tampilBuku();
                    break;
                case 3:
                    data.tampilPeminjaman();
                    break;
                case 4:
                    data.urutkanbedasarkandenda();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    data.cariBerdasarkanNIM(nim);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
        sc.close();

    }
}
