package Pertemuan14;

import java.util.Scanner;

public class BinaryTreeArrayMain29 {
    public static void main(String[] args) {
        BinaryTreeArray29 bta = new BinaryTreeArray29();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        Mahasiswa29 mhs1 = new Mahasiswa29("220101001", "Andi", "TI-1A", 3.95);
        Mahasiswa29 mhs2 = new Mahasiswa29("220101002", "Budi", "TI-1A", 3.20);
        Mahasiswa29 mhs3 = new Mahasiswa29("220101003", "Sinta", "TI-1B", 3.82);
        Mahasiswa29 mhs4 = new Mahasiswa29("220101004", "Rina", "TI-1B", 3.45);
        Mahasiswa29 mhs5 = new Mahasiswa29("220101005", "Dimas", "TI-1C", 2.75);
        Mahasiswa29 mhs6 = new Mahasiswa29("220101006", "Fajar", "TI-1C", 3.10);
        Mahasiswa29 mhs7 = new Mahasiswa29("220101007", "Nabila", "TI-1D", 3.76);
        Mahasiswa29 mhs8 = new Mahasiswa29("220101008", "Rizky", "TI-1D", 3.50);
        Mahasiswa29 mhs9 = new Mahasiswa29("220101009", "Aulia", "TI-1E", 3.88);
        Mahasiswa29 mhs10 = new Mahasiswa29("220101010", "Kevin", "TI-1E", 3.00);

        Mahasiswa29[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, mhs8, mhs9, mhs10};
        int idxLast = 9;
        bta.populateData(dataMahasiswa, idxLast);

        do{
            System.out.println("\n Menu Data Mahasiswa");
            System.out.println("1. Cari Mahasiswa berdasarkan Nama");
            System.out.println("2. Tampilkan 3 Mahasiswa dengan IPK tertinggi");
            System.out.println("3. Tampilkan Mahasiswa dari kelas tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama yang dicari : ");
                    String namaCari = scan.next();
                    bta.carinama(namaCari);
                    break;
                case 2:
                    bta.tigaipktertinggi();
                    break;
                case 3:
                    System.out.println("Format nama kelas : TI-1A, TI-1B, dst");
                    System.out.print("Masukkan kelas yang dicari : ");
                    String kelasCari = scan.next();
                    bta.carikelas(kelasCari);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();

        // System.out.println("\nInorder Traversal Mahasiswa: ");
        // bta.traverseInOrder(0);

        // System.out.println("\n=== HASIL TUGAS PRAKTIKUM ===");
        // System.out.println("PreOrder Traversal Mahasiswa: ");
        // bta.traversePreOrder(0);
    }
}
