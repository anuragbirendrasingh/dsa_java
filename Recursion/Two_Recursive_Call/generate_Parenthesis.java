package Recursion.Two_Recursive_Call;

import java.util.ArrayList;
import java.util.*;

public class generate_Parenthesis {
    public static void main(String[] args) {
        List <String> ll = new ArrayList<>();
        generate_balanced_parenthesis_of_given_n(3, 0, 0, "", ll);
        System.out.println(ll);
    }

    public static void generate_balanced_parenthesis_of_given_n(int n, int open, int close, String ans,List<String> ll) {

        if (open == n && close == n) {
            // System.out.println(ans);
            ll.add(ans);
            return;
        }

        // unequal count ho jaye agar to handle karo
        if (open > n || close > open) {
            return;
        }

        generate_balanced_parenthesis_of_given_n(n, open + 1, close, ans + "(",ll);
        generate_balanced_parenthesis_of_given_n(n, open, close + 1, ans + ")",ll);
    }
}
