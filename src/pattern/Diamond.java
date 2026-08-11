package pattern;

/**
 * INTERVIEW FAVORITE: Diamond
 *
 * n = 5 (n should be odd for a neat diamond; here n = rows in upper half)
 *
 *     *
 *   * * *
 * * * * * *
 *   * * *
 *     *
 *
 * Approach:
 *   1) print upper pyramid (1..n)
 *   2) print lower inverted pyramid (n-1..1)
 *
 * Dry run upper i=2, n=3:
 *   spaces=1, stars=3
 */
public class Diamond {

    public static void main(String[] args) {
        int n = 3; // upper half rows

        // upper half (including middle)
        for (int i = 1; i <= n; i++) {
            printLine(n, i);
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {
            printLine(n, i);
        }
    }

    private static void printLine(int n, int i) {
        for (int s = 1; s <= n - i; s++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
