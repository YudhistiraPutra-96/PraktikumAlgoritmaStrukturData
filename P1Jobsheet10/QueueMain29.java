package P1Jobsheet10;

import java.util.Scanner;

public class QueueMain29 {
    public static void menu() {
        System.out.println("Masukkan Operasi yang Diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pilih;
        System.out.print("Masukkan Kapasitas queue : ");
        int n = sc.nextInt();

        Queue29 Q = new Queue29(n);

        do {
            menu();
            System.out.print("Masukkan Menu :");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if(Q.IsFull()){
                        System.out.print("penuh");
                        pilih = 6;
                        break;
                    }else{ 
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;
                    }
                   
                case 2:
                    if(Q.IsEmpty()){
                        System.out.print("penuh");
                        pilih = 6;
                        break;
                    }else{
                    int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0) {
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                        }
                    } 
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
