package Basic;

public class forLoop {
    public static void main(String[] args) {

        // way 1
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // way 2
        int j = 10;
        for (; j <= 15; j++) {
            System.out.print(j + " ");
        }

        // way 3
        int k = 101;
        for (; k <= 105;) {
            System.out.print(k + " ");
            k++;
        }

        // way 4
        for (int l = 1001; l <= 1005;) {
            System.out.print(l + " ");
            l++;
        }

    }
}
