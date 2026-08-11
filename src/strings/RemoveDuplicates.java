package strings;

/**
 * Concept: track seen characters while building result.
 *
 * INTERVIEW-ISH:
 *   Remove duplicate characters from a string (keep first occurrence).
 *
 * Example:
 *   "programming" → "progamin"
 *
 * Idea:
 *   boolean[256] seen
 *   for each char:
 *     if not seen → append + mark seen
 *
 * Dry run "programming":
 *   p yes, r yes, o yes, g yes, r skip, a yes, m yes, m skip, i yes, n yes, g skip
 *   → progamin
 *
 * Time: O(n)   Space: O(1) alphabet table + result builder
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String s = "programming";
        System.out.println(s + " → " + removeDuplicates(s));
    }

    private static String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
