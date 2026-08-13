package jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAM JADWAL KULIAH ===");
        
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        
  
        String[][] jadwal = new String[n][4];
        
        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Cari Jadwal Berdasarkan Hari");
            System.out.println("4. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch(pilihan) {
                case 1:
                    inputJadwal(jadwal);
                    break;
                case 2:
                    tampilkanSemuaJadwal(jadwal);
                    break;
                case 3:
                    cariJadwalByHari(jadwal);
                    break;
                case 4:
                    cariJadwalByMataKuliah(jadwal);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 5);
    }
    
    static void inputJadwal(String[][] jadwal) {
        System.out.println("\n=== INPUT JADWAL KULIAH ===");
        
        for(int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i+1) + ":");
            
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            
            System.out.print("Jam Kuliah (contoh: 08.00-10.00): ");
            jadwal[i][3] = sc.nextLine();
        }
        
        System.out.println("\nData jadwal berhasil disimpan!");
    }
    
    static void tampilkanSemuaJadwal(String[][] jadwal) {
        if(jadwal[0][0] == null) {
            System.out.println("\nBelum ada data jadwal!");
            return;
        }
        
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.println("=================================================================================");
        System.out.println("| No | Mata Kuliah           | Ruang               | Hari    | Jam             |");
        System.out.println("=================================================================================");
        
        for(int i = 0; i < jadwal.length; i++) {
            if(jadwal[i][0] != null) {
                System.out.printf("| %-3d| %-20s | %-20s | %-7s | %-15s |\n",
                    (i+1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
        
        System.out.println("=================================================================================");
    }
    
    static void cariJadwalByHari(String[][] jadwal) {
        if(jadwal[0][0] == null) {
            System.out.println("\nBelum ada data jadwal!");
            return;
        }
        
        System.out.print("\nMasukkan hari yang dicari: ");
        String hariCari = sc.nextLine();
        
        System.out.println("\n=== JADWAL PADA HARI " + hariCari.toUpperCase() + " ===");
        System.out.println("=================================================================================");
        System.out.println("| No | Mata Kuliah           | Ruang               | Hari    | Jam             |");
        System.out.println("=================================================================================");
        
        boolean ditemukan = false;
        for(int i = 0; i < jadwal.length; i++) {
            if(jadwal[i][0] != null && jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.printf("| %-3d| %-20s | %-20s | %-7s | %-15s |\n",
                    (i+1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        
        if(!ditemukan) {
            System.out.println("|                      TIDAK ADA JADWAL PADA HARI INI                       |");
        }
        
        System.out.println("=================================================================================");
    }
    
    static void cariJadwalByMataKuliah(String[][] jadwal) {
        if(jadwal[0][0] == null) {
            System.out.println("\nBelum ada data jadwal!");
            return;
        }
        
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String mkCari = sc.nextLine();
        
        System.out.println("\n=== JADWAL MATA KULIAH: " + mkCari.toUpperCase() + " ===");
        System.out.println("=================================================================================");
        System.out.println("| No | Mata Kuliah           | Ruang               | Hari    | Jam             |");
        System.out.println("=================================================================================");
        
        boolean ditemukan = false;
        for(int i = 0; i < jadwal.length; i++) {
            if(jadwal[i][0] != null && jadwal[i][0].equalsIgnoreCase(mkCari)) {
                System.out.printf("| %-3d| %-20s | %-20s | %-7s | %-15s |\n",
                    (i+1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        
        if(!ditemukan) {
            System.out.println("|                MATA KULIAH TIDAK DITEMUKAN DALAM JADWAL                    |");
        }
        
        System.out.println("=================================================================================");
    }
}