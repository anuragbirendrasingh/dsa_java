package Basic;

public class demo_Continue {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            if (i == 4 || i== 2 || i==0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
// basically isme bhai continue ke hit karte hi siddha 
// iteration badd jaa hai i++ ho jata hai so uske niche
// flow of the code nhi jata hai 