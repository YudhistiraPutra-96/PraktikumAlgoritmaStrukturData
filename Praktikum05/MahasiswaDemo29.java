package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi29 list = new MahasiswaBerprestasi29(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("NIM: "); 
            String nim = sc.nextLine();
            System.out.print("Nama: "); 
            String nama = sc.nextLine();
            System.out.print("Kelas: "); 
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble(); 
            sc.nextLine();
            list.tambah(new Mahasiswa29(nim, nama, kelas, ipk));
        }

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK menggunakan Bubble Sort (DESC): ");
    list.bubbleSort();
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
    list.selectionSort();
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
    list.insertionSort();
    list.tampil();
    }
}
