package strings;

import java.util.Arrays;

/**
 * Concept: frequency / sorted form of characters.
 *
 * INTERVIEW FAVORITE:
 *   Check if two strings are anagrams
 *   (same characters with same counts, order may differ).
 *
 * Example:
 *   "listen" and "silent" → true
 *   "hello" and "world"   → false
 *
 * Approach used here (easy revision):
 *   1. if lengths differ → false
 *   2. convert to char arrays
 *   3. sort both
 *   4. compare arrays
 *
 * Dry run:
 *   listen → eilnst
 *   silent → eilnst
 *   equal → true
 *
 * Time: O(n log n) due to sort   Space: O(n)
 */
public class Anagram {

    public static void main(String[] args) {
        System.out.println("listen / silent → " + isAnagram("listen", "silent"));
        System.out.println("hello / world   → " + isAnagram("hello", "world"));
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
