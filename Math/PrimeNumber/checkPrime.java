package Math.PrimeNumber;

public class checkPrime {
    public static void main(String[] args) {
        int n = 9;
        // for(int i=2 ; i<n;i++){
        // if(n%i==0){
        // System.out.println(n + " Not Prime");
        // }

        // }
        // System.out.println("Prime " + n);

        isPrime(n);

    }

    // public static String isPrime(int n){
    // for(int i=2 ; i<n ; i++){
    // if(n % i == 0){
    // return "Not Prime";
    // }
    // return "Prime ";
    // }
    // }

    public static void isPrime(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count >= 1) {
            System.out.println("Not Prime");
        } else {
            System.out.println("prime");
        }
    }
}
