package conditions_loops;

import java.util.Scanner;

/**
 * Check whether the first character of input is lowercase or uppercase.
 *
 * Idea: letters are stored as numbers (ASCII / Unicode).
 *   'a' to 'z' → 97 to 122
 *   'A' to 'Z' → 65 to 90
 *
 * So comparing chars with >= and <= is like comparing their codes.
 *
 * Input examples:
 *   a → Lowercase
 *   Z → Uppercase
 *   hello → checks only 'h' → Lowercase
 */
public class CaseCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = readFirstChar(input);

        System.out.println(checkCase(ch));
    }

    /**
     * Reads one token, trims spaces, then takes the first character.
     *
     * Steps:
     *   1. next()     → next word from input (stops at space)
     *   2. trim()     → remove leading/trailing spaces
     *   3. charAt(0)  → first character of that word
     *
     * Dry run:
     *   input "  Hello"
     *   next()  → "Hello" (or with spaces depending on input)
     *   trim()  → "Hello"
     *   charAt(0) → 'H'
     */
    private static char readFirstChar(Scanner input) {
        return input.next().trim().charAt(0);
    }

    /**
     * Returns "Lowercase" or "Uppercase" for the given character.
     *
     * if (ch >= 'a' && ch <= 'z')
     *   → true only when ch is in the lowercase range
     *
     * else
     *   → treated as Uppercase here (simple version for revision)
     *
     * Note: non-letters (digits, symbols) also fall into the else branch.
     */
    private static String checkCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return "Lowercase";
        } else {
            return "Uppercase";
        }
    }
}
