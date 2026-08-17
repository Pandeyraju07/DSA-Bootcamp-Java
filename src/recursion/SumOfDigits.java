package recursion;

/**
 * Concept: Sum of digits / product of digits using recursion.
 *
 * Idea for sum:
 *   sum(n) = (n % 10) + sum(n / 10)
 *   base: n == 0 → 0
 *
 * Dry run sum(1342):
 *   2 + sum(134)
 *   2 + 4 + sum(13)
 *   2 + 4 + 3 + sum(1)
 *   2 + 4 + 3 + 1 + sum(0) → 10
 *
 * Product tip:
 *   base n%10 when n < 10 (single digit), else (n%10) * product(n/10)
 *
 * Time: O(d)   Space: O(d)  where d = number of digits
 */
public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("Sum of digits(1342) = " + digitSum(1342));
        System.out.println("Product of digits(55) = " + digitProduct(55));
    }

    private static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

    private static int digitProduct(int n) {
        if (n % 10 == n) { // single digit
            return n;
        }
        return (n % 10) * digitProduct(n / 10);
    }
}
