package Praktikum05;

import java.util.Scanner;

public class MainDosen29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas data dosen: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();
        DataDosen29 data = new DataDosen29(kapasitas);
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (Bubble Sort) - termuda ke tertua");
            System.out.println("4. Sorting DSC (Insertion Sort) - tertua ke termuda");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (L/P): ");
                    String jk = sc.nextLine();
                    boolean kelamin = jk.equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    Dosen29 dsn = new Dosen29(kode, nama, kelamin, usia);
                    data.tambah(dsn);
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\n=== DATA DOSEN ===");
                    data.tampil();
                    break;
                case 3:
                    data.bubbleSortASC();
                    System.out.println("Data setelah sorting ASC (termuda ke tertua):");
                    data.tampil();
                    break;
                case 4:
                    data.insertionSort();
                    System.out.println("Data setelah sorting DSC (tertua ke termuda):");
                    data.tampil();
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
