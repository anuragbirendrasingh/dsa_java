package Recursion.Basic;

public class sum_n_num {
    public static void main(String[] args) {
        int n = 5;
       int ans = sum(n);
       System.out.println(ans);
    }

    public static int sum(int n){
        if(n==0){
           return 0 ;
        }

        int decreasedN = sum(n-1);
        return decreasedN + n ;
    }
}
