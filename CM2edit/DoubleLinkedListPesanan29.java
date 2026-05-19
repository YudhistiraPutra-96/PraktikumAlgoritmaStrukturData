package CM2edit;

public class DoubleLinkedListPesanan29 {
    NodePesanan29 head;
    NodePesanan29 tail;
    int totalPendapatan = 0;
    
    public DoubleLinkedListPesanan29() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addLast(Pesanan29 data, String namaPembeli, int noAntrian) {
        NodePesanan29 newNode = new NodePesanan29(data, namaPembeli, noAntrian);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        totalPendapatan += data.harga;
        System.out.println(namaPembeli + " telah memesan " + data.namaPesanan);
    }
    
    public void sortByNamaPesanan() {
        if (isEmpty() || head == tail) 
            return;
        boolean swapped;
        do {
            swapped = false;
            NodePesanan29 current = head;
            
            while (current != null && current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan29 tempData = current.data;
                    String tempNama = current.namaPembeli;
                    int tempNo = current.noAntrian;
                    
                    current.data = current.next.data;
                    current.namaPembeli = current.next.namaPembeli;
                    current.noAntrian = current.next.noAntrian;
                    
                    current.next.data = tempData;
                    current.next.namaPembeli = tempNama;
                    current.next.noAntrian = tempNo;
                    
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }
        
        sortByNamaPesanan();
        
        System.out.println("Laporan Pesanan");
        System.out.println("=============================");
        System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
        NodePesanan29 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        System.out.println("=============================");
        System.out.println("TOTAL PENDAPATAN: Rp " + totalPendapatan);
    }
}
