package Recursion.Basic;

public class factorial_tail {
    public static void main(String[] args) {
        int n = 5 ;
        int res = factorial_using_tail_recursion(n, 1);
        System.out.println(res);

    }

    public static int factorial_using_tail_recursion(int n , int ans){
        if(n==0){
            return ans;
        }
        return factorial_using_tail_recursion(n-1,  n * ans);
    }
}
