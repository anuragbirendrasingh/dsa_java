package Recursion.Loop_In_Recurssion;

public class char_Is_Present {
    public static void main(String[] args) {
        String str = "abca";
        char ch = 'a';

        boolean ans = isPresent(str, ch,1);
        System.out.println(ans);
    }

    public static boolean isPresent(String str, char ch,int i) {
        for (int j = i; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                return true;
            }
        }
        return false;
    }
}
