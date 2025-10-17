package Queue.staticQueue;

public class queueClient {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
        q.display();
        q.isEmpty();
        System.out.println(q.isEmpty());
        q.dequeue();
        q.display();
        q.dequeue();
        System.out.println(q.dequeue());
    }
}
