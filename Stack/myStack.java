package Stack;

public class myStack {
    int[] arr;
    int idx = -1;

    public myStack() {
        this(5);
    }

    public myStack(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        if (idx == -1) {
            return true;
        }
        return false;
    }

    public int size() {
        return idx + 1;
    }

    public boolean isfull() {
        if (idx == arr.length - 1) {
            return true;
        }
        return false;
    }

    public void push(int item) throws Exception {

        if (isfull()) {
            throw new Exception("Stack is full");
        }
        arr[++idx] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        int removedElement = arr[idx];
        idx--;
        return removedElement;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return arr[idx];
    }

    public void display(){
        for(int i=0 ; i<=idx; i++){
            System.out.println(arr[i] +  " ");
        }
        System.out.println();
    }

}
