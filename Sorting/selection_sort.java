package Sorting;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 60, 40, 30, 10, 20 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minidx = get_minimum_index(arr, i);
            if (arr[i] > arr[minidx]) {
                int temp = arr[minidx];
                arr[minidx] = arr[i];
                arr[i] = temp;

            }

        }

    }

    public static int get_minimum_index(int[] arr, int idx) {
        int minidx = idx;
        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[i] < arr[minidx]) {
                minidx = i;
            }
        }
        return minidx;
    }
}
