package pattern;

/**
 * INTERVIEW FAVORITE: Hourglass
 *
 * n = 5
 * * * * * * * * * *
 *   * * * * * * *
 *     * * * * *
 *       * * *
 *         *
 *       * * *
 *     * * * * *
 *   * * * * * * *
 * * * * * * * * * *
 *
 * = inverted pyramid + pyramid without duplicating middle row
 */
public class Hourglass {

    public static void main(String[] args) {
        int n = 5;

        // inverted pyramid
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower pyramid (skip first row to avoid double middle)
        for (int i = 2; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
