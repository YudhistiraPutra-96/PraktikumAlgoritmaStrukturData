package jobsheet1;
import java.util.Scanner;

public class Tugas1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        
        System.out.println("\n");
        
        System.out.print("Masukkan kode plat nomor (huruf kapital): ");
        char kodeInput = sc.next().toUpperCase().charAt(0);
        
        boolean ditemukan = false;
        int index = -1;
        
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodeInput) {
                index = i;
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.print("\nKode plat '" + kodeInput + "' adalah kota: ");
            
            for (int j = 0; j < KOTA[index].length; j++) {
                System.out.print(KOTA[index][j]);
            }
            
            System.out.println();
        } else {
            System.out.println("\nKode plat '" + kodeInput + "' tidak ditemukan.");
        }
    
    }

}
