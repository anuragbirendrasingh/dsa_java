package Queue.circularQueue;

public class queueClient {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        
        
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();

        System.out.println(q.size());

        q.enqueue(60);
        q.display();
    }
}
