package conditions_loops;

import java.util.Scanner;

/**
 * Reverse the digits of a positive integer.
 *
 * Examples:
 *   1234 → 4321
 *   100  → 1      (leading zeros in reverse are dropped as an int)
 *   7    → 7
 *
 * Idea: peel off the last digit each time and build the answer from left to right.
 *
 * Two useful ops:
 *   num % 10  → last digit (remainder)
 *   num / 10  → number without the last digit
 */
public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Reversed: " + reverseDigits(number));
    }

    /**
     * Returns the reverse of a non-negative integer.
     *
     * Variables:
     *   num → copy of input; shrinks as we remove digits from the right
     *   rem → current last digit
     *   ans → reversed number being built
     *
     * Each lap of the loop:
     *   1. rem = num % 10          → take last digit
     *   2. num = num / 10          → drop that last digit
     *   3. ans = ans * 10 + rem    → append digit to the answer
     *
     * Why ans * 10?
     *   Shift existing digits one place left, then add the new digit.
     *   Example: ans was 3, rem is 2 → 3 * 10 + 2 = 32
     *
     * Dry run for number = 1234:
     *   start: num=1234, ans=0
     *   rem=4, num=123, ans=0*10+4=4
     *   rem=3, num=12,  ans=4*10+3=43
     *   rem=2, num=1,   ans=43*10+2=432
     *   rem=1, num=0,   ans=432*10+1=4321
     *   stop (num is 0) → 4321
     */
    private static int reverseDigits(int number) {
        int num = number;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;     // last digit
            num /= 10;              // remove last digit
            ans = ans * 10 + rem;   // append digit to answer
        }

        return ans;
    }
}
