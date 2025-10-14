package Recursion.Basic;

public class isSorted_arr {
    public static void main(String[] args) {
        int[] arr = {10};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }

    public static boolean isSorted(int[] arr,int idx){
        if(idx == arr.length-1){
            return true ;
        }

        if(arr[idx] > arr[idx+1]){
           return false ;
        }


        return isSorted(arr, idx + 1);
    }
}
