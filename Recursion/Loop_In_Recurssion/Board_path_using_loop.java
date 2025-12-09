package Recursion.Loop_In_Recurssion;

public class Board_path_using_loop {
    public static void main(String[] args) {
        int n = 4;
        Print(n, 0, "");
    }

    public static void Print(int n, int curr, String ans) {
        if (n == curr) {
            System.out.println(ans);
            return;
        }

        if (curr > n) {
            return;
        }

        // for(int i = 1 ; i<= 3 ; i++){
        // Print(n, curr + i, ans + i);
        // }

        for (int dice = 1; dice <= 3; dice++) {
            Print(n, curr + dice, ans + dice);
        }
    }
}
