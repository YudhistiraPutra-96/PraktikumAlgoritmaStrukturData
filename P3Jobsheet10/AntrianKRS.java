package P3Jobsheet10;

public class AntrianKRS {
    Mahasiswa [] data;
    int front;
    int size;
    int rear;
    int max;
    int jumlahDiproses;

     public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDiproses = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian sudah kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh! Maksimal 10 mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian KRS");
    }

    public void prosesKRS() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang bisa diproses.");
            return;
        }

        if (size < 2) {
            System.out.println("Antrian hanya berisi " + size + " mahasiswa. Minimal 2 mahasiswa untuk diproses.");
            return;
        }

        if (jumlahDiproses >= 30) {
            System.out.println("Kuota DPA sudah mencapai 30 mahasiswa! Tidak dapat memproses lagi.");
            return;
        }

        System.out.println("\n=== PROSES KRS OLEH DPA ===");

        for (int i = 0; i < 2; i++) {
            if (!IsEmpty() && jumlahDiproses < 30) {
                Mahasiswa mhs = data[front];
                System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
                mhs.tampilkandata();
                System.out.println("Status: KRS DISETUJUI ✓");
         
                front = (front + 1) % max;
                size--;
                jumlahDiproses++;
            }
        }
        
        System.out.println("Total mahasiswa yang sudah diproses KRS: " + jumlahDiproses);
        System.out.println("Sisa antrian: " + size + " mahasiswa");
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("\n=== DAFTAR ANTRIAN KRS ===");
        System.out.println("No | NIM | Nama | Prodi | Kelas");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + "  ");
            data[index].tampilkandata();
        }
        System.out.println("Jumlah antrian: " + size);
    }

    public void tampilkanDuaTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("\n=== 2 ANTRIAN TERDEPAN ===");
        int jumlahTampil = Math.min(2, size);
        for (int i = 0; i < jumlahTampil; i++) {
            int index = (front + i) % max;
            System.out.print("Antrian ke-" + (i + 1) + ": ");
            data[index].tampilkandata();
        }
        if (size < 2) {
            System.out.println("(Antrian hanya berisi " + size + " mahasiswa)");
        }
    }

    public void tampilkanPalingAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.print("\nAntrian paling akhir: ");
        data[rear].tampilkandata();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDiproses() {
        return jumlahDiproses;
    }

    public int getSisaBelumProses() {
        return 30 - jumlahDiproses;
    }
    
}

