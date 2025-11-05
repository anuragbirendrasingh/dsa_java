package LinkedList.LL_Implementation;

public class Likedlist {

    public class Node {
        int val;
        Node next;
    }

    Node head;
    Node tail;
    int size;

    // O(1)
    public int size() {
        return size;
    }

    // add first
    public void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;

        }

        size++;
    }

    // add last
    public void addLast(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            tail = nn;
            head = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    // add at index
    public void addAtIndex(int idx, int item) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (idx == 0) {
            addFirst(item);
            return;
        } else if (idx == size) {
            addLast(item);
            return;
        } else {
            Node nn = new Node();
            nn.val = item;
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
            size++;
        }

    }

    // remove first
    // O(1)
    public void removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {

            head = head.next;
        }
        size--;
    }

    // remove last
    // o(n)
    public void removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;

    }

    // remove at anyIndex
    // O(n)
    public void removeAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index Assign By User");
            return;
        } else if (idx == 0) {
            removeFirst();
        } else if (idx == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next; // // skip the node at idx
            size--;
        }
        
    }

    // get first
    // o(1)
    public void getFirst() {
           if(size == 0) {
        System.out.println("List is empty");
        return;
    }
        System.out.println(head.val);
    }

    // o(1)
    // get last
    public void getLast() {
           if(size == 0) {
        System.out.println("List is empty");
        return;
    }
        System.out.println(tail.val);
    }

    // getAtIndex
    // o(n)
    public void getAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        } else if (idx == 0) {
            getFirst();
        } else if (idx == size - 1) {
            getLast();
        } else {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            System.out.println(temp.val + " ");
        }
    }

    // display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " - > ");
            temp = temp.next;
        }
        System.out.println("null ");
    }

}
