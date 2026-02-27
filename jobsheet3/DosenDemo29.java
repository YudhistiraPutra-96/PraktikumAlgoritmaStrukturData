package jobsheet3;

import java.util.Scanner;

public class DosenDemo29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyak data dosen yang ingin dimasukkan : ");
        int n;
        n = sc.nextInt();
        sc.nextLine();

        Dosen29 [] arrayofdosen = new Dosen29 [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            
            System.out.print("Kode \t\t : ");
            String kode = sc.nextLine();
            
            System.out.print("Nama \t\t : ");
            String nama = sc.nextLine();
            
            System.out.print("Jenis Kelamin \t : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            
            System.out.print("Usia \t\t : ");
            int usia = Integer.parseInt(sc.nextLine());
            
            arrayofdosen[i] = new Dosen29(kode, nama, jenisKelamin, usia);
            System.out.println("---------------------------------------------------");
        }
        
        System.out.println("");
        System.out.println("A. DATA SEMUA DOSEN");
        System.out.println("");
        DataDosen29.dataSemuaDosen(arrayofdosen);
        
        System.out.println("");
        System.out.println("B. JUMLAH DOSEN PER JENIS KELAMIN");
        System.out.println("");
        DataDosen29.jumlahDosenPerJenisKelamin(arrayofdosen);
        
        System.out.println("");
        System.out.println("C. RATA-RATA USIA PER JENIS KELAMIN");
        System.out.println("");
        DataDosen29.rerataUsiaDosenPerJenisKelamin(arrayofdosen);
        
        System.out.println("");
        System.out.println("D. INFO DOSEN PALING TUA");
        System.out.println("");
        DataDosen29.infoDosenPalingTua(arrayofdosen);
        
        System.out.println("");
        System.out.println("E. INFO DOSEN PALING MUDA");
        System.out.println("");
        DataDosen29.infoDosenPalingMuda(arrayofdosen);
        
        sc.close();
    }
}
