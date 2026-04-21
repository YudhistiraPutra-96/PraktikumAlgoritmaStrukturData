package jobsheet9;

public class StackSurat29 {
    Surat29 [] stack;
    int top;
    int size;

    public StackSurat29(int size){
        this.size = size;
        stack = new Surat29 [size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1){
            return true;
        }else{
            return false;
        }
    } 

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Surat29 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat izin dari " + surat.namaMahasiswa + " berhasil diterima.");
        } else {
            System.out.println("Stack Penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat29 pop() {
        if (!isEmpty()) {
            Surat29 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack Kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat29 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada surat yang masuk.");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisizin + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }

    public void carisurat(String nama){
        boolean ditemukan = false;
        for(int i = 0; i <= top; i++){
            if(stack[i].namaMahasiswa.equalsIgnoreCase(nama)){
            System.out.println("\n=== SURAT DITEMUKAN ===");
            System.out.println("ID Surat: " + stack[i].idSurat);
            System.out.println("Nama Mahasiswa: " + stack[i].namaMahasiswa);
            System.out.println("Kelas: " + stack[i].kelas);
            System.out.println("Jenis Izin: " + stack[i].jenisizin);
            System.out.println("Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if(!ditemukan){
            System.out.println("Surat izin atas nama " + nama + " tidak ditemukan !");
        }
    }
}
