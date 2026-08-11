package strings;

/**
 * Concept: frequency count using array / map idea.
 *
 * INTERVIEW FAVORITE:
 *   Find the first non-repeating character.
 *
 * Example:
 *   "swiss" → 'w'
 *   "aabb"  → '_' (none)
 *
 * Approach:
 *   1. count frequency of each char (int[256] for ASCII)
 *   2. scan string again, return first char with count == 1
 *
 * Dry run "swiss":
 *   counts: s=3, w=1, i=1
 *   scan: s(count3) skip, w(count1) → return 'w'
 *
 * Time: O(n)   Space: O(1) for fixed alphabet
 */
public class FirstNonRepeating {

    public static void main(String[] args) {
        System.out.println("swiss → " + firstNonRepeating("swiss"));
        System.out.println("aabb  → " + firstNonRepeating("aabb"));
    }

    private static char firstNonRepeating(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '_'; // none found
    }
}
