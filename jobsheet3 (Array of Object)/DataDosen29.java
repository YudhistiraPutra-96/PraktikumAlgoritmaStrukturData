package jobsheet3;

public class DataDosen29 {


    static void dataSemuaDosen(Dosen29 [] arrayofdosen){
        if(arrayofdosen.length == 0){
            System.out.println("Data dosen kosong");
            return;
        }

        int nomor = 1;
        for (Dosen29 dosen : arrayofdosen) {
            System.out.println("Data Dosen ke-" + nomor++);
            System.out.println("Kode \t\t : " + dosen.kode);
            System.out.println("Nama \t\t : " + dosen.nama);
            
            System.out.println("Jenis Kelamin \t : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            
            System.out.println("Usia \t\t : " + dosen.usia);
            System.out.println("-----------------------------------------------------");
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen29 [] arrayofdosen){
        if(arrayofdosen.length == 0){
            System.out.println("Data dosen kosong");
            return;
        }

        int jumlahpria = 0;
        int jumlahwanita = 0;

        for (Dosen29 dosen : arrayofdosen){
            if(dosen.jenisKelamin){
                jumlahpria++;
            }else{
                jumlahwanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria\t: " + jumlahpria);
        System.out.println("Jumlah Dosen Wanita\t: " + jumlahwanita);
        System.out.println("-----------------------------------------------------");
        
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen29 [] arrayofdosen){
        if(arrayofdosen.length == 0){
            System.out.println("Data dosen kosong");
            return;
        }

        int jumlahpria = 0;
        int jumlahwanita = 0;
        int totalusiapria = 0;
        int totalusiawanita = 0;

        for (Dosen29 dosen : arrayofdosen){
            if(dosen.jenisKelamin){
                totalusiapria += dosen.usia;
                jumlahpria++;
            }else{
                totalusiawanita += dosen.usia;
                jumlahwanita++;
            }   
        }

        if(jumlahpria > 0){
            double ratapria = (double) totalusiapria/jumlahpria;
            System.out.println("Rata-rata usia pria:" + ratapria);
        }else{
            System.out.println("Tidak ada data dosen pria");
        }

        System.out.println("");

        if(jumlahwanita > 0){
            double ratawanita = (double) totalusiawanita/jumlahwanita;
            System.out.println("Rata-rata usia wanita :" + ratawanita);
        }else{
            System.out.println("Tidak ada data dosen wanita");
        }
        System.out.println("-----------------------------------------------------");
    }

    static void infoDosenPalingTua(Dosen29 [] arrayofdosen){
        if(arrayofdosen.length == 0){
            System.out.println("Data dosen kosong");
            return;
        }

        Dosen29 dosenTertua = arrayofdosen[0];
        
        for (int i = 1; i < arrayofdosen.length; i++) {
            if (arrayofdosen[i].usia > dosenTertua.usia) {
                dosenTertua = arrayofdosen[i];
            }
        }
        
        System.out.println("=== DOSEN PALING TUA ===");
        System.out.println("Kode\t\t: " + dosenTertua.kode);
        System.out.println("Nama\t\t: " + dosenTertua.nama);
        String jkString = dosenTertua.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("Jenis Kelamin\t: " + jkString);
        System.out.println("Usia\t\t: " + dosenTertua.usia + " tahun");
        System.out.println("-----------------------------------------------------");
    
    }

    static void infoDosenPalingMuda(Dosen29 [] arrayofdosen){
        if(arrayofdosen.length == 0){
            System.out.println("Data dosen kosong");
            return;
        }

        Dosen29 dosenTermuda = arrayofdosen[0];
        
        for (int i = 1; i < arrayofdosen.length; i++) {
            if (arrayofdosen[i].usia < dosenTermuda.usia) {
                dosenTermuda = arrayofdosen[i];
            }
        }
        
        System.out.println("=== DOSEN PALING MUDA ===");
        System.out.println("Kode\t\t: " + dosenTermuda.kode);
        System.out.println("Nama\t\t: " + dosenTermuda.nama);
        String jkString = dosenTermuda.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("Jenis Kelamin\t: " + jkString);
        System.out.println("Usia\t\t: " + dosenTermuda.usia + " tahun");
        System.out.println("-----------------------------------------------------");
    
    }
}
