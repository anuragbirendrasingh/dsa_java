package misc;

public class fundemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        change_value(arr);

    }

    public static void change_value(int[] arr){
        arr[0] = 100 ;
        System.out.println(arr[0]);
         arr = new int[]{10,20,30,40};
         System.out.println(arr[0]);
    }
}
