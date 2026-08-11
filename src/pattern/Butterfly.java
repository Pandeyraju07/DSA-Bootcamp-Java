package pattern;

/**
 * INTERVIEW FAVORITE: Butterfly pattern
 *
 * n = 4
 * *             *
 * * *         * *
 * * * *     * * *
 * * * * * * * * *
 * * * * * * * * *
 * * * *     * * *
 * * *         * *
 * *             *
 *
 * Upper row i (1..n):
 *   left stars  = i
 *   spaces      = 2*(n-i)
 *   right stars = i
 *
 * Lower is mirror of upper.
 *
 * Dry run i=2, n=4:
 *   stars=2, spaces=4 → * *     * *
 */
public class Butterfly {

    public static void main(String[] args) {
        int n = 4;

        // upper
        for (int i = 1; i <= n; i++) {
            printWingRow(n, i);
        }
        // lower
        for (int i = n; i >= 1; i--) {
            printWingRow(n, i);
        }
    }

    private static void printWingRow(int n, int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int s = 1; s <= 2 * (n - i); s++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
