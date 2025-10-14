package Stack;

public class myStack_Client {
    public static void main(String[] args) throws Exception{
        myStack st = new myStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.peek();
        System.out.println(st.peek());
        st.size();
        st.display();
    }
}
