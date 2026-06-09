package Pertemuan14;

public class BinaryTreeArray29 {
    Mahasiswa29[] dataMahasiswa;
    int idxLast;
    int size;

    public BinaryTreeArray29() {
        this.dataMahasiswa = new Mahasiswa29[10];
    }

    void populateData(Mahasiswa29 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa29 data) {
        if (idxLast + 1 >= size) {
            Mahasiswa29[] newArray = new Mahasiswa29[size * 2];
            System.arraycopy(dataMahasiswa, 0, newArray, 0, size);
            dataMahasiswa = newArray;
            size = size * 2;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

    void carinama(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= idxLast; i++) {
            if (dataMahasiswa[i] != null && dataMahasiswa[i].nama.equalsIgnoreCase(nama)) {
                dataMahasiswa[i].tampilInformasi();
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Mahasiswa dengan nama " + nama + " tidak ditemukan.");
        }
    }

    void tigaipktertinggi() {
        if (idxLast < 0) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }

        double[] ipkList = new double[idxLast + 1];
        int count = 0;
        for (int i = 0; i <= idxLast; i++) {
            if (dataMahasiswa[i] != null) {
                ipkList[count++] = dataMahasiswa[i].ipk;
            }
        }
        
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (ipkList[i] < ipkList[j]) {
                    double temp = ipkList[i];
                    ipkList[i] = ipkList[j];
                    ipkList[j] = temp;
                }
            }
        }
        
        int batas = (count < 3) ? count : 3;
        for (int i = 0; i < batas; i++) {
            for (int j = 0; j <= idxLast; j++) {
                if (dataMahasiswa[j] != null && dataMahasiswa[j].ipk == ipkList[i]) {
                    dataMahasiswa[j].tampilInformasi();
                    break;
                }
            }
        }
    }

    void carikelas(String kelas) {
        boolean ketemu = false;
        for (int i = 0; i <= idxLast; i++) {
            if (dataMahasiswa[i] != null && dataMahasiswa[i].kelas.equalsIgnoreCase(kelas)) {
                dataMahasiswa[i].tampilInformasi();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Tidak ada mahasiswa di kelas " + kelas);
        }
    }
}
