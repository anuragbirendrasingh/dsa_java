package Basic;

public class isPrime_Using_break {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count >= 1) {
            System.out.println("NOt Prime Number");
        } else {
            System.out.println(" Prime Number");
        }
    }
}

// break always loop se bahar kar deta hai 
// na ki condition(if else ) se bahar aata hai
