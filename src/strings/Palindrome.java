package strings;

/**
 * Concept: compare characters from both ends.
 *
 * INTERVIEW FAVORITE:
 *   Check if a string is a palindrome.
 *
 * Example:
 *   "madam" → true
 *   "hello" → false
 *
 * Idea:
 *   start=0, end=n-1
 *   while start < end:
 *     if chars differ → false
 *     else start++, end--
 *   → true
 *
 * Dry run "madam":
 *   m==m, a==a, middle d → true
 *
 * Time: O(n)   Space: O(1)
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("madam → " + isPalindrome("madam"));
        System.out.println("hello → " + isPalindrome("hello"));
        System.out.println("Racecar (ignore case) → " + isPalindromeIgnoreCase("Racecar"));
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isPalindromeIgnoreCase(String s) {
        return isPalindrome(s.toLowerCase());
    }
}
