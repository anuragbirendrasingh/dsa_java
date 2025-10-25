package Basic;

public class isPrime {
    public static void main(String[] args) {
        int n = 7 ;
        int count = 0 ;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>=1){
            System.out.println("NOt Prime Number");
        }
        else{
            System.out.println(" Prime Number");
        }
    }
}
