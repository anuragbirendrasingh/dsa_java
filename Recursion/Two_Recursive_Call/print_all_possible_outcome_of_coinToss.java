package Recursion.Two_Recursive_Call;

public class print_all_possible_outcome_of_coinToss {
    public static void main(String[] args) {

        int n = 3;
        String ans = "";
        Print(n, ans);
    }

    public static void Print(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        Print(n - 1, ans + "H");
        Print(n - 1, ans + "T");
    }

}