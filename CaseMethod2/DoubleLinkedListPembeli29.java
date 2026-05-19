package CaseMethod2;

public class DoubleLinkedListPembeli29 {
    NodePembeli29 head;
    NodePembeli29 tail;
    
    public DoubleLinkedListPembeli29() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addLast(Pembeli29 data) {
        NodePembeli29 newNode = new NodePembeli29(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + data.noAntrian);
    }
    
    public Pembeli29 removefirst(int noAntrian) {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return null;
        }
        
        NodePembeli29 current = head;
        while (current != null && current.data.noAntrian != noAntrian) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Data dengan No Antrian " + noAntrian + " tidak ditemukan.");
            return null;
        }
        
        Pembeli29 dataTerhapus = current.data;
        
        if (head == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        
        return dataTerhapus;
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=============================");
        System.out.println("No Antrian\tNama\tNo HP");
        NodePembeli29 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        System.out.println("=============================");
    }
}
