package recursion;

/**
 * Concept: Patterns with recursion (triangle).
 *
 * INTERVIEW WARM-UP:
 *   Think "row + col" like nested loops, but recursive.
 *
 * Pattern (* * * / * * / *):
 *   if col < row → print *, recurse col+1
 *   else         → new line, recurse row-1, col=0
 *
 * Dry run triangle(4, 0):
 *   ****
 *   ***
 *   **
 *   *
 *
 * Time: O(n^2)   Space: O(n)
 */
public class TrianglePattern {

    public static void main(String[] args) {
        System.out.println("Normal triangle:");
        triangle(4, 0);

        System.out.println("\nInverted triangle:");
        triangle2(4, 0);
    }

    // **** / *** / ** / *
    private static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }

    // * / ** / *** / ****
    private static void triangle2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            triangle2(row, col + 1);
            System.out.print("* ");
        } else {
            triangle2(row - 1, 0);
            System.out.println();
        }
    }
}
