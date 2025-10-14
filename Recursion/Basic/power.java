package Recursion.Basic;

public class power {
    public static void main(String[] args) {
        int a = 2;
        int n = 3;
        int ans = pow(a, n);
        System.out.println(ans);
    }

    public static int pow(int a, int n) {
        if (n == 0) {

            return 1;
        }

        int curr = pow(a, n - 1);
        return curr * a;

    }
}
