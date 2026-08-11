package pattern;

/**
 * INTERVIEW FAVORITE: Hollow pyramid
 *
 * n = 5
 *         *
 *       *   *
 *     *       *
 *   *           *
 * * * * * * * * * *
 *
 * For row i:
 *   spaces = n - i
 *   width  = 2*i - 1
 *   print '*' at first/last position of width,
 *   OR on last row print all '*'.
 *
 * Dry run i=3:
 *   spaces=2, width=5
 *   positions: * _ _ _ *  → *   *
 */
public class HollowPyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            int width = 2 * i - 1;
            for (int j = 1; j <= width; j++) {
                if (j == 1 || j == width || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
