package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int nilai = sc.nextInt();
        
        Faktorial f = new Faktorial();
        System.out.println("nilai faktorial "+nilai+" menggunakan BF: " + f.faktorialBF(nilai));
        System.out.println("nilai faktorial "+nilai+" menggunakan DC: " + f.faktorialDC(nilai));
    }
}
