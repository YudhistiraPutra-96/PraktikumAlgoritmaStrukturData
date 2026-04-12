package CaseMethod1;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(){

    }

    Mahasiswa(String nm, String name, String prodi){
        nim = nm;
        nama = name;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println(nim + "\t" + nama + "\t" + prodi);
    }

}
