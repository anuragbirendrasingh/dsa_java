package Stack;

import java.util.Stack;;

public class nextGreaterElement {

    public static void main(String[] args) {
        int[] arr = { 14, 5, 2, 25 };
        int[] result = NGE(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] NGE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.pop()] = arr[i];
            }

            st.push(i);
        }

        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        return ans;

    }
}
