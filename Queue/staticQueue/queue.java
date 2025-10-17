package Queue.staticQueue;

// static queue 
public class queue {

    private int[] arr;
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    // size defualt or user ki marji
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
        arr[rear] = item;
        size++;
        rear++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int removed = arr[front];
        front++;
        size--;
        return removed;
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
