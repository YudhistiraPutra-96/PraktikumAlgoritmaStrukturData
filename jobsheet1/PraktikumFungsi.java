package jobsheet1;

public class PraktikumFungsi {

    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    
    public static void main(String[] args) {
        int [][] royalgarden = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("=== PENDAPATAN SETIAP CABANG ===");
        tampilkanPendapatan(royalgarden);
        
        System.out.println("\n=== STATUS SETIAP CABANG ===");
        tampilkanStatus(royalgarden);
    }

    static void tampilkanPendapatan(int[][] stock) {
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * hargaBunga[j];
            }
            
           System.out.println("RoyalGarden " + (i + 1) + ": Rp" + totalPendapatan);
        }
    }
    
    static void tampilkanStatus(int[][] stock) {
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * hargaBunga[j];
            }
            
            String status;
            if (totalPendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }
            
            System.out.println("RoyalGarden " + (i + 1) + ": Rp" + totalPendapatan + " - Status: " + status);
        }
    }    
}
