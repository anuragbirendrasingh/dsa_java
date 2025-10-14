package Recursion.Basic;

public class last_occurenece_arr {
      public static void main(String[] args) {
        int[] arr = { 1,2,3,4,1,1};
        int item = 1;
        int n = arr.length -1;
        int index = last_occurence(arr, item, n);
        System.out.println(index);
    }

    public static int last_occurence(int[] arr,int item,int idx){
         if(idx == 0){
            return -1 ;
         }

         if(arr[idx]==item){
            return idx ;
         }
         return last_occurence(arr, item, idx-1);
    }
}
