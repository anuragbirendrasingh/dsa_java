package Recursion.Two_Recursive_Call;

// print all possible outcome of coins if Toss
// but there should not be the TWO consecutive Head
public class coinToss_printAllPossibleOutcome_Except_Conse {
    public static void main(String[] args) {
        int n = 4;
        String ans = "";

        print(n, ans);
    }

    public static void print(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            print(n - 1, ans + 'H');
        }

        print(n - 1, ans + 'T');
    }

}
