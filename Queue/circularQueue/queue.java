package Queue.circularQueue;

public class queue {
    private int[] arr;
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public queue() {
        this(5);
    }

    public queue(int n) {
        arr = new int[n];
    }

     public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size() == arr.length) {
            return true;
        }
        return false;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        int idx = rear % arr.length ;
        arr[idx] = item ;
        rear++;
        size++;
        
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int idx = front % arr.length ;
        int removed = arr[idx] ;
        front++;
        size--;
        return removed;
    }

   public void display() {
    for (int i = 0; i < size; i++) {
        System.out.print(arr[(front + i) % arr.length] + " ");
    }
    System.out.println();
}


}
