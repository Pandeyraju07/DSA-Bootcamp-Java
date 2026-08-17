package recursion;

/**
 * Concept: Count zeros in a number (recursion).
 *
 * INTERVIEW VARIANT (LeetCode-style twin):
 *   Count steps to reduce number to 0
 *   (if even → /2, if odd → -1)
 *
 * Count zeros:
 *   if n%10 == 0 → count+1
 *   recurse on n/10
 *
 * Dry run countZero(30204):
 *   4 no, 0 yes, 2 no, 0 yes, 3 no → 2
 *
 * Time: O(d)   Space: O(d)
 */
public class CountZeros {

    public static void main(String[] args) {
        System.out.println("Zeros in 30204 = " + countZero(30204));
        System.out.println("Steps to zero(14) = " + numberOfSteps(14));
    }

    private static int countZero(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }

    // LeetCode: Number of Steps to Reduce a Number to Zero
    private static int numberOfSteps(int num) {
        return stepsHelper(num, 0);
    }

    private static int stepsHelper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return stepsHelper(num / 2, steps + 1);
        }
        return stepsHelper(num - 1, steps + 1);
    }
}
