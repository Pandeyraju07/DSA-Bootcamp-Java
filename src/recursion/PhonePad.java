package recursion;

import java.util.ArrayList;

/**
 * Concept: Letter Combinations of a Phone Number (recursion).
 *
 * TOP INTERVIEW / LEETCODE-STYLE:
 *   digits = "12"
 *   mapping: 1→abc, 2→def, ...
 *   answer: ad, ae, af, bd, be, bf, cd, ce, cf
 *
 * Idea:
 *   Take first digit → get its letters
 *   For each letter, append and recurse on remaining digits
 *
 * Dry run "12":
 *   digit 1 → a/b/c
 *   for each, digit 2 → d/e/f
 *
 * Time: O(4^n * n) worst   Space: O(n)
 */
public class PhonePad {

    public static void main(String[] args) {
        System.out.println(padList("", "12"));
        System.out.println("Count = " + padCount("", "12"));
    }

    private static ArrayList<String> padList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // '1' → 1
        ArrayList<String> ans = new ArrayList<>();

        // mapping: 1→a-c (0..2), 2→d-f (3..5), ...
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padList(p + ch, up.substring(1)));
        }
        return ans;
    }

    private static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count += padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
