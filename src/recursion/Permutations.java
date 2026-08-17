package recursion;

/**
 * Concept: Permutations using recursion.
 *
 * TOP INTERVIEW FAVORITE:
 *   Arrange all characters of a string in every possible order.
 *
 * Example:
 *   "abc" → abc, acb, bac, bca, cab, cba
 *
 * Idea:
 *   Pick first unprocessed char and insert it at EVERY position
 *   of the processed string.
 *
 * Dry run p="", up="abc":
 *   take 'a' → p="a"
 *   take 'b' → insert before/after a → "ba", "ab"
 *   ... continue until up empty
 *
 * Count of permutations of length n = n!
 *
 * Time: O(n! * n)   Space: O(n)
 */
public class Permutations {

    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println("Count = " + permutationCount("", "abc"));
    }

    private static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            permutations(first + ch + second, up.substring(1));
        }
    }

    private static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            count += permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
