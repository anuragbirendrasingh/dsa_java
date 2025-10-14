package misc;

public class prefix {


    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int idx = 3 ;
        // System.out.println(arr[++idx]); // 50
        System.out.println(arr[idx++]); // 40
        System.out.println(arr[idx]); // 50 
    }


}



