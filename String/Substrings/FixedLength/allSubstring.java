package String.Substrings.FixedLength;

public class allSubstring {
    public static void main(String[] args) {
        String str = "ABC";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
            ;
        }
    }
}

// isme dhyan dena hi substring(i,j) me j is excluded so inner loop length tak chalega 


