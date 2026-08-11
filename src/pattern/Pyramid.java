package pattern;

/**
 * INTERVIEW COMMON: Pyramid (centered triangle)
 *
 * n = 5
 *         *
 *       * * *
 *     * * * * *
 *   * * * * * * *
 * * * * * * * * * *
 *
 * For row i:
 *   spaces = n - i
 *   stars  = 2*i - 1
 *
 * Dry run i=3, n=5:
 *   spaces = 2
 *   stars  = 5
 *   → "  * * * * *"
 */
public class Pyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
