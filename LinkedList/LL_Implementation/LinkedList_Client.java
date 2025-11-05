package LinkedList.LL_Implementation;


public class LinkedList_Client {
    public static void main(String[] args) {
       Likedlist ll = new Likedlist();
       int size = ll.size();
       System.out.println(size);
       ll.addFirst(30);
       ll.addFirst(20);
       ll.addFirst(10);
       ll.addLast(50);
       ll.addAtIndex(2, 40);
       ll.removeFirst();
       ll.removeLast();
       ll.removeAtIndex(2);
       ll.getFirst();
       ll.getLast();

       ll.removeAtIndex(3);
       ll.display();
    }
}
