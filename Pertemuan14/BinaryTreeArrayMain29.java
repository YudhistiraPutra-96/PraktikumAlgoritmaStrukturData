package Pertemuan14;

public class BinaryTreeArrayMain29 {
    public static void main(String[] args) {
        BinaryTreeArray29 bta = new BinaryTreeArray29();

        Mahasiswa29 mhs1 = new Mahasiswa29("244160121", "Ali", "A", 3.57);
        Mahasiswa29 mhs2 = new Mahasiswa29("244160185", "Candra", "C", 3.41);
        Mahasiswa29 mhs3 = new Mahasiswa29("244160221", "Badar", "B", 3.75);
        Mahasiswa29 mhs4 = new Mahasiswa29("244160220", "Dewi", "B", 3.35);
        Mahasiswa29 mhs5 = new Mahasiswa29("244160131", "Devi", "A", 3.48);
        Mahasiswa29 mhs6 = new Mahasiswa29("244160205", "Ehsan", "D", 3.61);
        Mahasiswa29 mhs7 = new Mahasiswa29("244160170", "Fizi", "B", 3.86);

        Mahasiswa29[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\n=== HASIL TUGAS PRAKTIKUM ===");
        System.out.println("PreOrder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
}
