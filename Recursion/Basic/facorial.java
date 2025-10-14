package Recursion.Basic;

public class facorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }

    public static int fact(int n){
        if(n==1){
            return 1 ;
        }
        int pro = fact(n-1);
        return pro * n ;
    }
}
