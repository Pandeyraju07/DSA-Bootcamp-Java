package recursion;

/**
 * Concept: Reverse a number using recursion + helper.
 *
 * Idea:
 *   Keep building ans = ans * 10 + rem
 *   rem = n % 10, n = n / 10
 *
 * Dry run reverse(1234):
 *   rem=4 → ans=4
 *   rem=3 → ans=43
 *   rem=2 → ans=432
 *   rem=1 → ans=4321
 *
 * Interview twin: check palindrome number → n == reverse(n)
 *
 * Time: O(d)   Space: O(d)
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int n = 1234;
        int rev = reverse(n);
        System.out.println("Reverse(" + n + ") = " + rev);
        System.out.println("Is palindrome(1221)? " + isPalindrome(1221));
    }

    private static int reverse(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int ans) {
        if (n == 0) {
            return ans;
        }
        int rem = n % 10;
        return helper(n / 10, ans * 10 + rem);
    }

    private static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}
