package jobsheet9;

import java.util.Scanner;

public class SuratDemo29 {
    public static void main(String[] args) {

         
        StackSurat29 stack = new StackSurat29(5);
        Scanner sc = new Scanner (System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi(jumlah hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat29 surat = new Surat29(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat29 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.println("Surat telah divalidasi oleh Admin Prodi");
                    }
                    break;
                case 3:
                    Surat29 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir dari " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.carisurat(cariNama);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih <= 4);
   }
}
