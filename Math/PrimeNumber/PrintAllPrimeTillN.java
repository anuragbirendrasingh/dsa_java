package Math.PrimeNumber;

public class PrintAllPrimeTillN {
    public static void main(String[] args) {
        int n = 9;
        Print(n);
    }

    // public static void Print(int n) {

    //     for (int i = 2; i < n; i++) {
    //         int count = 0;
    //         for (int j = 2; j < i; j++) {
    //             if (i % j == 0) {
    //                 count++;
    //                 break;
    //             }
    //         }

    //         if (count == 0) {
    //             System.out.println(i);
    //         }
    //     }

    // }

    public static boolean IsPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false ;
            }
        }
        return true;
    }

    public static void Print(int n){
        // int count = 0;
        for(int i=2;i<n;i++){
            int count = 0;
            if(IsPrime(i)){
                count++;

            }
            if(count>=1){
                System.out.println(i);
            }
        }

       
    }
}
