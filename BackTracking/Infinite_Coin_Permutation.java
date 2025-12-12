package BackTracking;

public class Infinite_Coin_Permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4 };
        int amount = 6;
        Permutation(arr, "", amount, 0);
    }

    public static void Permutation(int[] arr, String ans, int amount, int currAmount) {
        if (currAmount == amount) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (currAmount > amount) {
                return;
            }

            Permutation(arr, ans + arr[i], amount, currAmount + arr[i]);
        }
    }
}
