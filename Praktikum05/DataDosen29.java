package Praktikum05;

public class DataDosen29 {
    Dosen29 [] listdosen = new Dosen29 [10];
    int idx;

    public DataDosen29(int n){
        listdosen = new Dosen29[n];
    }

    void tambah(Dosen29 dsn) {
        if (idx < listdosen.length) {
            listdosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil () {
        for (int i = 0; i < idx; i++) {
        listdosen[i].tampil();
        System.out.println("-------------------------------------------");
        }
    }

    void bubbleSortASC(){
        for (int i=0; i<listdosen.length-1; i++){
            for (int j=1; j<listdosen.length-i; j++){
                if (listdosen[j].usia > listdosen[j-1].usia){
                    Dosen29 tmp = listdosen[j];
                    listdosen[j]=listdosen[j-1];
                    listdosen[j-1]=tmp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASC dengan menggunakan Bubble sort (termuda -> tertua)");
    }

    void insertionSort(){
        for (int i=1; i<listdosen.length; i++){
            Dosen29 temp = listdosen[i];
            int j=i;
            while (j>0 && listdosen[j-1].usia < temp.usia){
                listdosen[j]=listdosen[j-1];
                j--;
            }
            listdosen[j]=temp;
        }
    }
}
