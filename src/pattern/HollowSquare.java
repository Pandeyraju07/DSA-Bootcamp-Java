package pattern;

/**
 * INTERVIEW FAVORITE: Hollow square
 *
 * n = 5
 * * * * * *
 * *       *
 * *       *
 * *       *
 * * * * * *
 *
 * Print '*' if:
 *   first row OR last row OR first col OR last col
 * else print space.
 *
 * Dry run i=2,j=3,n=5:
 *   not border → space
 */
public class HollowSquare {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
