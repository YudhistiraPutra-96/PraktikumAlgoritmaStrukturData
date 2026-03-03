package quiz1;

import java.util.Scanner;

public class menu29 {
    String menu;
    String nama;
    int jmlpesanan;
    double harga;

    public menu29(){

    }

    public menu29(String menu, String nama, int jmlpesanan, double harga){
        this.menu = menu;
        this.nama = nama;
        this.jmlpesanan = jmlpesanan;
        this.harga = harga;

    }

     void tambahData(Scanner sc) {
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("Nama Menu       : ");
        this.menu = sc.nextLine();
        System.out.print("Jumlah Pesanan : ");
        this.jmlpesanan = Integer.parseInt(sc.nextLine());
        System.out.print("Harga      : ");
        this.harga = Integer.parseInt(sc.nextLine());
        System.out.println("Total Harga : " + totalHarga());


    }

    double totalHarga() {
        return this.jmlpesanan * this.harga;
    }

    void tampilkanInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Nama Menu        : " + menu);
        System.out.println("Jumlah Pesanan  : " + jmlpesanan);
        System.out.println("Harga       : " + harga);
        System.out.println("Total Harga : " + totalHarga());
        
    }
}
