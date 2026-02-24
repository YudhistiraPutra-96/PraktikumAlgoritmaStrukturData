package jobsheet02;

public class MataKuliahMain29 {
    public static void main(String[] args) {
        
        MataKuliah29 mk1 = new MataKuliah29();
        mk1.kodeMK = "BD";
        mk1.nama = "Basis Data";
        mk1.sks = 5;
        mk1.jumlahJam = 3;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(3);
        mk1.kurangiJam(4);

        MataKuliah29 mk2 = new MataKuliah29("SO","Sistem Operasi", 4,3);
        mk2.tampilInformasi();
        mk2.tambahJam(3);
        mk2.kurangiJam(1);
    }    
}
