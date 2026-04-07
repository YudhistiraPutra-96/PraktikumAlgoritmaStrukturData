package jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi29 list = new MahasiswaBerprestasi29(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM \t: ");
            String nim = sc.nextLine();
            System.out.print("Nama \t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas \t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK \t: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---");
            list.tambah(new Mahasiswa29(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("---");
        System.out.println("Pencarian data");
        System.out.println("---");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearch(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // melakukan pencarian data Binary
        System.out.println("");
        System.out.println("Pencarian data");
        System.out.println("---");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double caribinary = sc.nextDouble();
        System.out.println("---");
        System.out.println("menggunakan binary search");
        System.out.println("---");
        double posisi2 = list.findBinarySearch(caribinary, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(caribinary, pss2);
        list.tampilDataSearch(caribinary, pss2);
    }
}
