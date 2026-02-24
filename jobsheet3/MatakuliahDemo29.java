package jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Berapa Matakuliah yang ingin ditambahkan: ");
        int n;
        n = sc.nextInt();
        Matakuliah29[] arrayOfMatakuliah = new Matakuliah29[n];
        

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah29();
            arrayOfMatakuliah[i].tambahData(sc);
            System.out.println("-----------------------------------------");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}

