package BackTracking;
// We need to print all possible arrangements of placing 2 queens on a 1D board of size 4, where:

// Queens are distinct (Queen 0 and Queen 1)
// Every queen must be placed in a different box
// Order matters → this is permutation, not combination

public class Queen_Permutation {
    public static void main(String[] args) {
        int n = 4;
        int[] board = new int[n];
        int tq = 2; // total queen
        int qpsf = 0; // queen place so far(ab tak kitna queen rakh diye hin)
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
                board[i] = 1; // queen placed hogya
                TotalArrangement(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
            }
        }
    }
}

// b0q0b1q1
// b0q0b2q1
// b0q0b3q1

// ab apne se jayega nhi placed queen to utakar rakhna hoga yahi hai
// backtracking....