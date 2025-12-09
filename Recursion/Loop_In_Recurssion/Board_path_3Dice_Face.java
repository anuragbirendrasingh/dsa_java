package Recursion.Loop_In_Recurssion;

//print all the possible path on the diceBoard
//maan lo 4 hamra hai 100 saanp sidhi ka game 

// number of dice face is === number of recursive call
public class Board_path_3Dice_Face {
    public static void main(String[] args) {
        int n = 4 ;
        Print(n, 0, "");
    }

    public static void Print(int n, int curr, String ans) {
        if (curr == n) {
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        Print(n, curr + 1, ans + 1); // ans me string me add hoga
        Print(n, curr + 2, ans + 2); // curr me numeric addition hai taki 4 se jayda na jayne hm
        Print(n, curr + 3, ans + 3);
    }
}
