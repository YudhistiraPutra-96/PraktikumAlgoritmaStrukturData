package jobsheet02;

public class MahasiswaMain29 {
    public static void main(String[] args) {

        Mahasiswa29 mhs1 = new Mahasiswa29();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa29 mhs2 = new Mahasiswa29("Annisa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa29 mhs3 = new Mahasiswa29("Budi Santoso", "2345678901", 3.75, "TI 3A");
        mhs3.tampilkanInformasi();
    }
}
