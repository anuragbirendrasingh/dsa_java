package Recursion.Multi_Path_Recursion;

public class Maze_Path {
    // print all the possible path jo hmko 0,0 se lekar 3,4 tak panhuchne me lagega
    public static void main(String[] args) {
        int n = 3; // row
        int m = 4; // column
        Path(0, 0, n - 1, m - 1, "");
    }

    // cr -> current row ; cc -> current column ; ec->end column , er -> end row,
    public static void Path(int cr, int cc, int er, int ec, String ans) {
        if (cr == er && cc == ec) {
            System.out.println(ans);
        }

        if (cr > er || cc > ec) {
            return;
        }
        Path(cr + 1, cc, er, ec, ans + 'H');
        Path(cr, cc + 1, er, ec, ans + 'V');
    }
}
