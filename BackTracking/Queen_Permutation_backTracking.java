package BackTracking;

public class Queen_Permutation_backTracking {
    public static void main(String[] args) {
        int n = 4;
        int[] board = new int[n];
        int tq = 2;
        int qpsf = 0;
        String ans = "";
        TotalArrangement(board, tq, qpsf, ans);
    }

    public static void TotalArrangement(int[] board, int tq, int qpsf, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {

            if (board[i] == 0) {
                board[i] = 1;
                TotalArrangement(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
                board[i] = 0; // yahi hai backtracking bhai jo hm call lagane ke baad
                              // jo true kar ke aay ehin usko false kar de rahe hin ..simple
            }
        }
    }
}

// Backtracking =
// Try → Recurse → Undo
// Here:
// ✔ Try
// board[i] = 1; → queen placed in box i
// ✔ Recurse
// TotalArrangement(board, tq, qpsf + 1, ...)
// ✔ Undo (Backtrack)
// board[i] = 0;
// → queen ko wapas nikal diya
// → taaki next possibilities try kar sake
// This undoing step makes sure hum har arrangement check kar payen.




// “Queen ko rakho → recursion lagao → aate waqt queen ko hata do.
// Yeh hi backtracking hai bhai!”
