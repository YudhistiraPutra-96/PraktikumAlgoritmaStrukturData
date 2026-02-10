package jobsheet1;

import java.util.Scanner;

public class PraktikumArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nilai;
        String[] mapel = new String [8];
        int[] nilaiangka = new int [8];
        String[] nilaihuruf = new String [8];
        double[] bobot = new double [8];
        int[] jmlsks = new int [8]; 
        

        System.out.println("=======================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================================");



        for(int i = 0; i < mapel.length; i++){
            System.out.print("Masukkan nama mata pelajaran ke-" + (i + 1) + ": ");
            mapel[i] = sc.nextLine();
            System.out.print("Masukkan bobot sks : ");
            jmlsks[i] = sc.nextInt();
            sc.nextLine(); 
        
        }
        System.out.println("=======================================");

        for(int i = 0; i < mapel.length; i++){
            System.out.print("Masukkan nilai " + mapel[i] + ": ");
            while(true){
                nilai = sc.nextInt();
                if(nilai < 0 || nilai > 100){
                    System.out.print("Nilai tidak valid. Masukkan nilai " + mapel[i] + " kembali: ");
                } else {
                    break;
                }
            }
            nilaiangka[i] = nilai;


             if (nilai > 80 && nilai <= 110) {
                nilaihuruf[i] = "A";
                bobot[i] = 4.00;
            } else if (nilai > 73) {
                nilaihuruf[i] = "B+";
                bobot[i] = 3.50;
            } else if (nilai > 65) {
                nilaihuruf[i] = "B";
                bobot[i] = 3.00;
            } else if (nilai > 60) {
                nilaihuruf[i] = "C+";
                bobot[i] = 2.50;
            } else if (nilai > 50) {
                nilaihuruf[i] = "C";
                bobot[i] = 2.00;
            } else if (nilai > 39) {
                nilaihuruf[i] = "D";
                bobot[i] = 1.00;
            } else {
                nilaihuruf[i] = "E";
                bobot[i] = 0;
            }
        }

       

        System.out.println("==============================");
        System.out.println("\nhasil Konversi Nilai");
        System.out.println("==============================");
        System.out.println();
        System.out.println("| MK    | Nilai Angka | Nilai Huruf | Bobot Nilai |");
        System.out.println("");
        
     
        for(int i = 0; i < mapel.length; i++){
            System.out.printf("| %-40s | %-10.2f | %-11s | %-11.2f |\n", 
                mapel[i], (double)nilaiangka[i], nilaihuruf[i], bobot[i]);
        }
        
        
        double totalbobot = 0;
        int totalSks = 0;
        
        for(int i = 0; i < mapel.length; i++){
            totalbobot += bobot[i] * jmlsks[i];
            totalSks += jmlsks[i];
        }
        
        double ipSemester = totalbobot / totalSks;
        
        System.out.printf("\nIP : %.2f\n", ipSemester);


    }

}
