package Recursion.Loop_In_Recurssion;

public class Permutation_OF_String {
    public static void main(String[] args) {
        String que = "abc";
        Print_All_Possible_Permutation(que, "");
    }

    public static void Print_All_Possible_Permutation(String que,String ans){
        if(que.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0 ; i<que.length();i++){
            char ch = que.charAt(i);
            String s1 = que.substring(0,i);
            String s2 = que.substring(i+1);
            Print_All_Possible_Permutation( s1 + s2, ans + ch);
        }
    }
}
