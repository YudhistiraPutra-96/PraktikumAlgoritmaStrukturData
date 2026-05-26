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
            // Resize array jika penuh
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
}
