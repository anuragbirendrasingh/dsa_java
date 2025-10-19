package String.Substrings;

public class printing_lengthWise {
    public static void main(String[] args) {
        String str = "ABC";

        for(int len = 1 ; len<=str.length();len++){

            for(int j = len ; j<=str.length() ; j++){

                int i = j - len ;

                System.out.println(str.substring(i, j));
            }
        }
    }
}
