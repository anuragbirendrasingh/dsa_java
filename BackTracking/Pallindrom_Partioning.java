package BackTracking;

import java.util.ArrayList;
import java.util.*;

// leet 131
// hmko baas all pallindrome chaiye
public class Pallindrom_Partioning {
    public static void main(String[] args) {
        String str = "nitin";

        List<List<String>> ans = new ArrayList<>();  // FINAL 2D answer
        List<String> ll = new ArrayList<>();         // list current

        Print_Only_Pallindromic_Substring(str, ll, ans);

        System.out.println(ans);
    }

    public static void Print_Only_Pallindromic_Substring(String que, List<String> ll, List<List<String>> ans) {
        if (que.length() == 0) {
            ans.add(new ArrayList<>(ll));   // copy add  
            return;
        }

        for (int i = 1; i <= que.length(); i++) {
            String quenWALAPART = que.substring(i);  // right part
            String s2 = que.substring(0, i);          // left part

            if (isPallindrome(s2)) {
                ll.add(s2);  // choose
                Print_Only_Pallindromic_Substring(quenWALAPART, ll, ans);
                ll.remove(ll.size() - 1);   // backtrack
            }
        }
    }

    public static boolean isPallindrome(String s2) {
        int m = 0;
        int n = s2.length() - 1;

        while (m < n) {
            if (s2.charAt(m) != s2.charAt(n)) {
                return false;
            }
            m++;
            n--;
        }
        return true;
    }
}

