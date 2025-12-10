package Recursion.Loop_In_Recurssion;

public class Permutation_2_removeDuplicates {
    public static void main(String[] args) {
        String que = "abca";
        Print_All_Possible_Permutation(que, "");
    }

    public static void Print_All_Possible_Permutation(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < que.length(); i++) {
            char ch = que.charAt(i);
            if (isPresent(que, ch, i + 1) == false) {
                String s1 = que.substring(0, i);
                String s2 = que.substring(i + 1);
                Print_All_Possible_Permutation(s1 + s2, ans + ch);
            }
        }
    }

    public static boolean isPresent(String str, char ch, int i) {
        for (int j = i; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                return true;
            }
        }
        return false;
    }
}
