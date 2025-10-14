package Stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reverse_Stack_usingStack(st);
    }

    public static void reverse_Stack_usingStack(Stack<Integer> st) {
        Stack<Integer> tempSt = new Stack<>();
        // for(int i=0; i<=st.size()+1;i++){ // kyunki size har pop ke sath ghat raha
        // hai yanha
        // int temp = st.pop();
        // tempSt.push(temp);
        // }
        while (!st.isEmpty()) {
            int temp = st.pop();
            tempSt.push(temp);
        }
        System.out.println(tempSt);

    }

    public static void reverse_stack_using_recurssion(Stack<Integer> st){
         if(st.isEmpty()){
            return ;
         }
         int top =  st.pop();
          reverse_Stack_usingStack(st);
          insert_at_bottom(st, top);
    }

    public static void insert_at_bottom(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return ;
        }
        int top = st.pop();
        insert_at_bottom(st, item);
        st.push(top);
    }
}
