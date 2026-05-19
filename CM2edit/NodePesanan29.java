package CM2edit;

public class NodePesanan29 {
    Pesanan29 data;
    String namaPembeli;
    int noAntrian;
    NodePesanan29 prev;
    NodePesanan29 next;
    
    public NodePesanan29(Pesanan29 data, String namaPembeli, int noAntrian) {
        this.data = data;
        this.namaPembeli = namaPembeli;
        this.noAntrian = noAntrian;
        this.prev = null;
        this.next = null;
    }
}
