package pattern;

/**
 * How to think about ANY pattern (interview approach).
 *
 * Almost every pattern = nested loops:
 *   outer loop → rows (i)
 *   inner loop(s) → spaces + stars/numbers for that row
 *
 * Ask 3 questions for each row i:
 *   1. How many leading spaces?
 *   2. How many symbols / what to print?
 *   3. What changes as i increases?
 *
 * Tip in interviews:
 *   First write for a fixed n (like 5), dry-run one row, then generalize.
 */
public class PatternTemplate {

    public static void main(String[] args) {
        System.out.println("Use this checklist before coding a pattern:");
        System.out.println("1) rows?");
        System.out.println("2) spaces in row i?");
        System.out.println("3) stars/numbers in row i?");
        System.out.println("4) print newline");
        System.out.println();
        System.out.println("Then solve files in this package one by one.");
    }
}
