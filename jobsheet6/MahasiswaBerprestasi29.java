package jobsheet6;

public class MahasiswaBerprestasi29 {
    Mahasiswa29 [] listmhs = new Mahasiswa29 [5];
    int idx;

    public MahasiswaBerprestasi29(int n){
        listmhs = new Mahasiswa29[n];
    }

    void tambah(Mahasiswa29 mhs){
        if (idx < listmhs.length) {
            listmhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil () {
        for (int i = 0; i < idx; i++) {
        listmhs[i].tampil();
        System.out.println("-------------------------------------------");
        }
    }

    int sequentialSearch(double cari){
        int posisi = -1;
        for (int j=0; j<listmhs.length; j++){
            if (listmhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    void tampilPosisi(double x, int pos){
        if (pos != -1){
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1){
            System.out.println("nim\t : " + listmhs[pos].nim);
            System.out.println("nama\t : " + listmhs[pos].nama);
            System.out.println("kelas\t : " + listmhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == listmhs[mid].ipk){
                return (mid);
            }
            else if (listmhs[mid].ipk < cari){
                return findBinarySearch(cari, left, mid - 1);
            }
            else{
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
