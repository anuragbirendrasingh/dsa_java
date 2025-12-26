package Math.PrimeNumber;

public class checkPrimeUsingBreak {
    public static void main(String[] args) {
        int n = 9;
        isPrime(n);
        prime(n);
    }

    public static void isPrime(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Not Prime");
        } else {
            System.out.println("isPrime");
        }
    }

    public static void prime(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0){
                System.out.println(i);
                continue;
            }
        }
    }
}
