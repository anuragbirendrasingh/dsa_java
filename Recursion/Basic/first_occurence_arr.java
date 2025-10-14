package Recursion.Basic;

public class first_occurence_arr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10 };
        int item = 4;
        int index = first_occurence(arr, item, 0);
        System.out.println(index);
    }

    public static int first_occurence(int[] arr, int item, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == item) {
            return idx;
        }

        return first_occurence(arr, item, idx + 1);
    }
}
