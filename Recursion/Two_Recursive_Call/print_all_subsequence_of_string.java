package Recursion.Two_Recursive_Call;

public class print_all_subsequence_of_string {
    public static void main(String[] args) {
        String ques = "abc";
        String ans = "";
       Print_All_Subsequence_OF_String(ques, ans);
    }

    public static void Print_All_Subsequence_OF_String(String ques,String ans){
         if(ques.length()==0){
            System.out.print(ans + " " );
            return ;
         }
        Character ch = ques.charAt(0);

        Print_All_Subsequence_OF_String(ques.substring(1), ans);  // No add nhi karna hai 
        Print_All_Subsequence_OF_String(ques.substring(1), ans + ch); //Yes add  karna hai
    }

}
