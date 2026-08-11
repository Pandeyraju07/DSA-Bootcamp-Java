package pattern;

/**
 * INTERVIEW WARM-UP: Inverted right triangle
 *
 * n = 5
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 * Row i prints (n - i + 1) stars.
 *
 * Dry run i=2, n=5:
 *   stars = 5-2+1 = 4 → * * * *
 */
public class InvertedRightTriangle {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
