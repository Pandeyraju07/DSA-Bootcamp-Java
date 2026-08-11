package pattern;

/**
 * INTERVIEW COMMON: Rhombus / parallelogram
 *
 * n = 5
 *         * * * * *
 *       * * * * *
 *     * * * * *
 *   * * * * *
 * * * * * *
 *
 * For row i:
 *   spaces = n - i
 *   stars  = n  (constant)
 *
 * Dry run i=2, n=5:
 *   spaces=3, stars=5
 */
public class Rhombus {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
