package jobsheet1;
import java.util.Scanner;

public class PraktikumPemilihan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {  
        int nilaitugas, nilaikuis, nilaiuts, nilaiuas;
        double nilaiakhir;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("====================================");
        
            System.out.print("Masukkan Nilai Tugas: ");
            nilaitugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis: ");
            nilaikuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS: ");
            nilaiuts = sc.nextInt();
            System.out.print("Masukkan Nilai UAS: ");
            nilaiuas = sc.nextInt();

            nilaiakhir = (0.2 * nilaitugas) + (0.2 * nilaikuis) + (0.3 * nilaiuts) + (0.3 * nilaiuas);

          if(nilaiakhir > 100 || nilaitugas < 0 || nilaikuis < 0 || nilaiuts < 0 || nilaiuas < 0 || nilaitugas > 100 || nilaikuis > 100 || nilaiuts > 100 || nilaiuas > 100){
              System.out.println("Input nilai tidak valid. Silakan masukkan nilai antara 0-100.");
              System.out.println("====================================");
            }

        else if(nilaiakhir <= 100 || nilaitugas > 0 || nilaikuis > 0 || nilaiuts > 0 || nilaiuas > 0){
            System.out.println("Nilai Akhir: " + nilaiakhir);
            if (nilaiakhir > 80 && nilaiakhir <= 100) {
                System.out.println("nilai huruf : A");
            } else if (nilaiakhir > 73) {
                System.out.println("nilai huruf : B+");
            } else if (nilaiakhir > 65) {
                System.out.println("nilai huruf : B");
            } else if (nilaiakhir > 60) {
                System.out.println("nilai huruf : C+");
            } else if (nilaiakhir > 50) {
                System.out.println("nilai huruf : C");
            } else if (nilaiakhir > 39) {
                System.out.println("nilai huruf : D");
            } else {
                System.out.println("nilai huruf : E");
            }
            if(nilaiakhir > 51){
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Selamat Anda Tidak Lulus");
            }
            System.out.println("====================================");
        }  
    }
}
