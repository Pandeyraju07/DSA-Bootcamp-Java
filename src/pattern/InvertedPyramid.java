package pattern;

/**
 * INTERVIEW COMMON: Inverted pyramid
 *
 * n = 5
 * * * * * * * * * *
 *   * * * * * * *
 *     * * * * *
 *       * * *
 *         *
 *
 * For row i (1..n):
 *   spaces = i - 1
 *   stars  = 2*(n-i) + 1
 *
 * Dry run i=2, n=5:
 *   spaces = 1
 *   stars  = 2*3 + 1 = 7
 */
public class InvertedPyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
