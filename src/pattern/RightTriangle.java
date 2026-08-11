package pattern;

/**
 * INTERVIEW WARM-UP: Right-angled triangle
 *
 * n = 5
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 *
 * Row i prints i stars.
 *
 * Dry run i=3:
 *   j = 1..3 → * * *
 */
public class RightTriangle {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
