package Pertemuan12;

public class QueueLinkedList29 {
    NodeQueue29 front;
    NodeQueue29 rear;

     boolean isEmpty() {
        return front == null;
    }

    void enqueue(Kemahasiswaan29 input) {
        NodeQueue29 ndInput = new NodeQueue29(input, null);
        if (isEmpty()) {
            front = ndInput;
            rear = ndInput;
        } else {
            rear.next = ndInput;
            rear = ndInput;
        }
        System.out.println(input.nama + " berhasil masuk antrian");
    }

    Kemahasiswaan29 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil!");
            return null;
        } else {
            Kemahasiswaan29 removed = front.data;
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
            }
            System.out.println(removed.nama + " sedang dipanggil");
            return removed;
        }
    }


    boolean isFull() {
        System.out.println("Queue berbasis Linked List tidak memiliki batas penuh");
        return false;
    }

    void clear() {
        front = null;
        rear = null;
        System.out.println("Antrian berhasil dikosongkan");
    }

    void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan: ");
            front.data.tampilInformasi();
        }
    }

    void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir: ");
            rear.data.tampilInformasi();
        }
    }

    int size() {
        int count = 0;
        NodeQueue29 temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("=== Daftar Antrian ===");
            NodeQueue29 temp = front;
            int no = 1;
            while (temp != null) {
                System.out.println("Antrian ke-" + no);
                temp.data.tampilInformasi();
                temp = temp.next;
                no++;
            }
            System.out.println("Total antrian: " + (no - 1));
        }
    }
}
