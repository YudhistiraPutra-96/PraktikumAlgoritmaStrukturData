package Pertemuan12;

import java.util.Scanner;

public class SLLMain29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SingleLinkedList29 sll = new SingleLinkedList29();

        // System.out.print("Masukkan jumlah mahasiswa yang akan ditambahkan: ");
        // int jumlah = sc.nextInt();
        // sc.nextLine();
        // for (int i = 0; i < jumlah; i++) {
        //     System.out.println("\nData mahasiswa ke-" + (i + 1));
        //     System.out.print("NIM: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Nama: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Kelas: ");
        //     String kelas = sc.nextLine();
        //     System.out.print("IPK: ");
        //     double ipk = sc.nextDouble();
            
        //     Mahasiswa29 mhs = new Mahasiswa29(nim, nama, kelas, ipk);
        //     sll.addLast(mhs);
        // }

        // System.out.println("\n=== Isi Linked List ===");
        // sll.print();

        Mahasiswa29 mhs1 = new Mahasiswa29("24212203", "Alvaro", "1A", 4.0);
        Mahasiswa29 mhs2 = new Mahasiswa29("23212203", "Bimon", "2B", 3.8);
        Mahasiswa29 mhs3 = new Mahasiswa29("22212203", "Cintia", "3C", 3.5);
        Mahasiswa29 mhs4 = new Mahasiswa29("21212203", "Dirga", "4D", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexof("bimon"));
        System.out.println();

        sll.removefirst();
        sll.removelast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }    
}
