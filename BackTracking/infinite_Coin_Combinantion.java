package BackTracking;

public class infinite_Coin_Combinantion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4 };
        int amonut = 6;
        Combinantion(arr, 0, amonut, "", 0);

    }

    public static void Combinantion(int[] arr, int currAmount, int amount, String ans, int idx) {
        if (currAmount == amount) {
            System.out.println(ans);
            return;
        }

        if (currAmount > amount) {
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            // if(currAmount > amount){
            // return ;
            // }

            Combinantion(arr, currAmount + arr[i], amount, ans + arr[i], i);
        }
    }
}
