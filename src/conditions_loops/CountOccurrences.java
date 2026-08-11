package conditions_loops;

import java.util.Scanner;

/**
 * Count how many times a digit appears in a number.
 *
 * Example:
 *   number = 1385757879, digit = 7 → count = 3
 *
 * Combines:
 *   while loop + % 10 + / 10  (same digit-peeling idea as Reverse)
 *   if condition to check match
 *
 * Steps each lap:
 *   1. rem = n % 10        → last digit
 *   2. if rem == digit     → count++
 *   3. n = n / 10          → remove last digit
 */
public class CountOccurrences {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.print("Enter digit to count (0-9): ");
        int digit = in.nextInt();

        System.out.println("Occurrences = " + countDigit(n, digit));
    }

    /**
     * Dry run: n = 1385757879, digit = 7
     *
     *   ...7879 → rem 9 no
     *          → rem 7 yes count=1
     *          → rem 8 no
     *          → rem 7 yes count=2
     *          → ...
     *          → rem 7 yes count=3
     *   done when n becomes 0
     */
    private static int countDigit(int n, int digit) {
        // special case: number is 0 and we are counting digit 0
        if (n == 0 && digit == 0) {
            return 1;
        }

        int count = 0;

        // work with absolute value so negatives don't break % logic in learning code
        n = Math.abs(n);

        while (n > 0) {
            int rem = n % 10;
            if (rem == digit) {
                count++;
            }
            n /= 10;
        }

        return count;
    }
}
