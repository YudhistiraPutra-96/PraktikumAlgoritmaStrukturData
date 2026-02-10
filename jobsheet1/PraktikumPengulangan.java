package jobsheet1;
import java.util.Scanner;

public class PraktikumPengulangan {
    static Scanner sc = new Scanner (System.in);
     public static void main(String[] args) {
        double nim, nimakhir;

        System.out.print("Masukkan NIM Anda: ");
        nim = sc.nextDouble();

        nimakhir = nim % 100;

        if(nimakhir < 10){
            nimakhir += 10;
            System.out.println("NIM Akhir Anda adalah: " + nimakhir);
        }else{
            System.out.println("NIM Akhir Anda adalah: " + nimakhir);
        }

        for(int i = 1; i <= nimakhir; i++){
            if (i == 10 || i == 15){
                continue;
            }else if(i % 2 == 1){
                System.out.print("*" + " ");
            }else if(i % 3 == 0){
                System.out.print("#" + " ");
            }else{
                System.out.print(i + " ");
            }

        }
     }
}
