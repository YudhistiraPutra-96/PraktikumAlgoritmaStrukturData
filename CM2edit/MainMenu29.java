package CM2edit;

import java.util.Scanner;

public class MainMenu29 {
    static DoubleLinkedListPembeli29 antrian = new DoubleLinkedListPembeli29();
    static DoubleLinkedListPesanan29 laporan = new DoubleLinkedListPesanan29();
    static int nextNoAntrian = 1;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;
        
        antrian.addLast(new Pembeli29(nextNoAntrian++, "Ainara", "08224500000"));
        antrian.addLast(new Pembeli29(nextNoAntrian++, "Danra", "08224511111"));
        antrian.addLast(new Pembeli29(nextNoAntrian++, "Sanri", "08224522222"));
        
        do {
            System.out.println("\nSISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Tambah Antrian Prioritas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = scan.nextLine();
                    System.out.print("No HP : ");
                    String noHp = scan.nextLine();
                    Pembeli29 pembeliBaru = new Pembeli29(nextNoAntrian, nama, noHp);
                    antrian.addLast(pembeliBaru);
                    nextNoAntrian++;
                    break;
                    
                case 2:
                    antrian.print();
                    break;
                    
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!");
                        break;
                    }
                    antrian.print();
                    System.out.print("Masukkan No Antrian yang dipanggil : ");
                    int no = scan.nextInt();
                    scan.nextLine();
                    
                    Pembeli29 p = antrian.removefirst(no);
                    if (p != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = scan.nextLine();
                        System.out.print("Harga : ");
                        int harga = scan.nextInt();
                        scan.nextLine();
                        
                        Pesanan29 pesanan = new Pesanan29(kode, namaPesanan, harga);
                        laporan.addLast(pesanan, p.pembeli, no);
                    }
                    break;
                    
                case 4:
                    laporan.print();
                    break; 
                
                case 5:
                    System.out.print("Nama Pembeli Prioritas : ");
                    String namaPrioritas = scan.nextLine();
                    System.out.print("No HP : ");
                    String noHpPrioritas = scan.nextLine();
                    Pembeli29 pembeliPrioritas = new Pembeli29(nextNoAntrian, namaPrioritas, noHpPrioritas);
                    antrian.tambahprioritas(pembeliPrioritas);
                    nextNoAntrian++;
                    break;
                    
                case 0:
                    System.out.println("Program selesai.");
                    break;
                    
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        
        scan.close();
    }
}
