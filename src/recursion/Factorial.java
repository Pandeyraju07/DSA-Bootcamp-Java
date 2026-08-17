package recursion;

/**
 * Concept: Factorial with recursion.
 *
 * Formula:
 *   n! = n * (n-1)!
 *   0! = 1, 1! = 1   ← base cases
 *
 * Dry run fact(4):
 *   4 * fact(3)
 *   4 * 3 * fact(2)
 *   4 * 3 * 2 * fact(1)
 *   4 * 3 * 2 * 1 = 24
 *
 * Time: O(n)   Space: O(n)
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("5! = " + fact(5));
    }

    private static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
