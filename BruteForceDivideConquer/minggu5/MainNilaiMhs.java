package BruteForceDivideConquer.minggu5;

public class MainNilaiMhs {
    public static void main(String[] args) {
        NilaiMhs[] daftarMhs = {
            new NilaiMhs("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMhs("Budi", "220101002", 2022, 85, 88),
            new NilaiMhs("Cindy", "220101003", 2021, 90, 87),
            new NilaiMhs("Dian", "220101004", 2021, 76, 79),
            new NilaiMhs("Eko", "220101005", 2023, 92, 95),
            new NilaiMhs("Fajar", "220101006", 2020, 88, 85),
            new NilaiMhs("Gina", "220101007", 2023, 80, 83),
            new NilaiMhs("Hadi", "220101008", 2020, 82, 84)
        };

        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama\tNIM\t\tTahun Masuk\tUTS\tUAS");
        for (NilaiMhs m : daftarMhs) {
            System.out.println(m);
        }
        System.out.println();

        int maxUTS = cariMaxUTS(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);

        int minUTS = cariMinUTS(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("b) Nilai UTS terendah (Divide and Conquer): " + minUTS);

        double rataUAS = hitungRataUAS(daftarMhs);
        System.out.println("c) Rata-rata nilai UAS (Brute Force): " + rataUAS);
    }

    static int cariMaxUTS(NilaiMhs[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri].getNilaiUTS();
        }
        int mid = (kiri + kanan) / 2;
        int maxKiri = cariMaxUTS(arr, kiri, mid);
        int maxKanan = cariMaxUTS(arr, mid + 1, kanan);
        return Math.max(maxKiri, maxKanan);
    }

    static int cariMinUTS(NilaiMhs[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri].getNilaiUTS();
        }
        int mid = (kiri + kanan) / 2;
        int minKiri = cariMinUTS(arr, kiri, mid);
        int minKanan = cariMinUTS(arr, mid + 1, kanan);
        return Math.min(minKiri, minKanan);
    }

    static double hitungRataUAS(NilaiMhs[] arr) {
        int total = 0;
        for (NilaiMhs m : arr) {
            total += m.getNilaiUAS();
        }
        return (double) total / arr.length;
    }
}
