package recursion;

import java.util.ArrayList;

/**
 * Concept: Subsequences / subsets using recursion (include / exclude).
 *
 * TOP INTERVIEW FAVORITE:
 *   For each character/element: either TAKE it or SKIP it.
 *
 * Example:
 *   "abc" subsequences:
 *   "", a, b, c, ab, ac, bc, abc
 *
 * Dry run processed="", unprocessed="abc":
 *   take 'a' → ("a","bc")
 *   skip 'a' → ("","bc")
 *   ... continue until unprocessed empty → print processed
 *
 * Time: O(2^n)   Space: O(n) stack
 */
public class Subsequences {

    public static void main(String[] args) {
        System.out.println("Print all:");
        subseq("", "abc");

        System.out.println("\nAs list: " + subseqList("", "abc"));
    }

    private static void subseq(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed.isEmpty() ? "\"\"" : processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed + ch, unprocessed.substring(1)); // take
        subseq(processed, unprocessed.substring(1));      // skip
    }

    private static ArrayList<String> subseqList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqList(p + ch, up.substring(1));
        ArrayList<String> right = subseqList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
