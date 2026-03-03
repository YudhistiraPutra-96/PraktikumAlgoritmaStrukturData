package quiz1;

import java.util.Scanner;

public class menudemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pelanggan : ");
        int n = sc.nextInt();
        sc.nextLine();

        menu29[] arrayOfPelanggan = new menu29[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data pelanggan ke-" + (i + 1));
            arrayOfPelanggan[i] = new menu29();
            arrayOfPelanggan[i].tambahData(sc);
            System.out.println("-----------------------------------------");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Data pelanggan ke-" + (i + 1));
            arrayOfPelanggan[i].tampilkanInfo();
            System.out.println("-----------------------------------------");
        }
    }
}
