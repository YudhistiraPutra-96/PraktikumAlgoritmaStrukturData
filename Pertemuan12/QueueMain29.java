package Pertemuan12;

import java.util.Scanner;

public class QueueMain29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList29 antrian = new QueueLinkedList29();
        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println("UNIT KEMAHASISWAAN - ANTRIAN");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Mahasiswa Baru ---");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    Kemahasiswaan29 mhs = new Kemahasiswaan29(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    System.out.println("\n--- Memanggil Antrian ---");
                    antrian.dequeue();
                    break;

                case 3:
                    System.out.println("\n--- Antrian Terdepan ---");
                    antrian.peekFront();
                    break;

                case 4:
                    System.out.println("\n--- Antrian Paling Akhir ---");
                    antrian.peekRear();
                    break;

                case 5:
                    System.out.println();
                    antrian.print();
                    break;

                case 6:
                    System.out.println("\nJumlah mahasiswa mengantre: " + antrian.size() + " orang");
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 8:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 8);
    }
}