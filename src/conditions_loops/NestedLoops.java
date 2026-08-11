package conditions_loops;

/**
 * Nested loops — a loop inside another loop.
 *
 * Outer loop → rows / major steps
 * Inner loop → columns / work inside each outer step
 *
 * Total laps ≈ outerCount * innerCount
 *
 * Practice: print a right-angled star pattern and a multiplication table.
 */
public class NestedLoops {

    public static void main(String[] args) {
        multiplicationTable();
        starPattern();
    }

    /**
     * Print table of 1 to 3 (small, easy to revise).
     *
     * Dry run (i = 2):
     *   inner j = 1..3
     *   2 x 1 = 2
     *   2 x 2 = 4
     *   2 x 3 = 6
     */
    private static void multiplicationTable() {
        System.out.println("=== 1. MULTIPLICATION TABLE (1 to 3) ===");

        for (int i = 1; i <= 3; i++) {          // outer: which number
            for (int j = 1; j <= 3; j++) {      // inner: multiply by 1..3
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // blank line after each table
        }
    }

    /**
     * PRACTICE: right triangle of stars
     *
     * n = 4 →
     *   *
     *   * *
     *   * * *
     *   * * * *
     *
     * Idea:
     *   outer i = row number (1..n)
     *   inner j = print i stars in that row
     *
     * Dry run for i = 3:
     *   j runs 1..3 → print * * *
     */
    private static void starPattern() {
        System.out.println("=== 2. STAR PATTERN ===");

        int n = 4;

        for (int i = 1; i <= n; i++) {       // rows
            for (int j = 1; j <= i; j++) {   // stars in this row
                System.out.print("* ");
            }
            System.out.println();            // next row
        }
    }
}
