package Math.PrimeNumber;

public class isPrime {
    public static void main(String[] args) {
        int n = 7 ;
        boolean ans = Prime(n);
        System.out.println(ans);
    }
    

    // tc --> sqrt(n)
    public static boolean Prime(int n){
        int i = 2;
        while(i * i <= n){
            if(n%i==0){
                return false ;
            }
            i++;
        }
        return true ;
    }
}
