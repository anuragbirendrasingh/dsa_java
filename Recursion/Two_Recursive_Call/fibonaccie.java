package Recursion.Two_Recursive_Call;

public class fibonaccie {
    public static void main(String[] args) {
        int n = 5;
        int ans = fib(n);
        System.out.println(ans);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = fib(n - 1);
        int f2 = fib(n - 2);
        return f1 + f2;
    }
}
