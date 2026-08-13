package searching;

/**
 * Concept: linear scan + digit counting.
 *
 * TOP INTERVIEW / LEETCODE-STYLE:
 *   Count how many numbers have an EVEN number of digits.
 *
 * Example:
 *   nums = [12, 345, 2, 6, 7896]
 *   12   → 2 digits (even)
 *   345  → 3 (odd)
 *   2    → 1 (odd)
 *   6    → 1 (odd)
 *   7896 → 4 (even)
 *   → answer = 2
 *
 * Digit count options:
 *   A) loop: while (n > 0) { digits++; n /= 10; }
 *   B) shortcut: (int)(Math.log10(n) + 1)
 *
 * Time: O(n * d)   Space: O(1)
 */
public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("Even-digit count = " + findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean hasEvenDigits(int num) {
        num = Math.abs(num);

        // 0 has 1 digit → odd
        if (num == 0) {
            return false;
        }

        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits % 2 == 0;
    }
}
