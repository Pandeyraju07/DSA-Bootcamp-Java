package conditions_loops;

/**
 * break and continue inside loops.
 *
 * break    → leave the loop immediately
 * continue → skip the rest of THIS lap, go to next lap
 *
 * Labeled break/continue (rare, but asked in interviews):
 *   useful with nested loops to jump out of the OUTER loop too.
 */
public class BreakContinue {

    public static void main(String[] args) {
        breakExample();
        continueExample();
        labeledBreakExample();
    }

    /**
     * break: stop the loop when value becomes 5.
     *
     * Dry run (print 1..10, but break at 5):
     *   1 2 3 4 then i==5 → break → loop ends
     *   6..10 never print
     */
    private static void breakExample() {
        System.out.println("=== 1. BREAK ===");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exit loop now
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * continue: skip even numbers, print only odds.
     *
     * Dry run (i = 1 to 6):
     *   1 → print
     *   2 → even → continue (skip print)
     *   3 → print
     *   4 → skip
     *   5 → print
     *   6 → skip
     */
    private static void continueExample() {
        System.out.println("\n=== 2. CONTINUE (skip evens) ===");

        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue; // skip even
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Labeled break: break out of BOTH loops.
     *
     * Without label, break only exits the INNER loop.
     * With label outer:, break outer exits the outer loop too.
     *
     * Dry run:
     *   i=1,j=1 → print
     *   i=1,j=2 → print
     *   i=1,j=3 → hit break outer → both loops stop
     */
    private static void labeledBreakExample() {
        System.out.println("\n=== 3. LABELED BREAK (nested loops) ===");

        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 3) {
                    break outer; // leave outer loop, not only inner
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
