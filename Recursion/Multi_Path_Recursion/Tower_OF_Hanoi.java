package Recursion.Multi_Path_Recursion;

public class Tower_OF_Hanoi {
    public static void main(String[] args) {
        int n = 3;
        TOH(n, "A", "B", "C");
    }

    public static void TOH(int n, String src, String help, String dest) {
        if (n == 0) {
            return;
        }

        TOH(n - 1, src, dest, help);
        System.out.println("Moved " + n + " disck from " + src + " to " + dest);
        TOH(n - 1, help, src, dest);
    }
}
