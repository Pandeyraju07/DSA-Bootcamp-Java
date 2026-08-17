package recursion;

/**
 * Concept: Recursion — a method calling itself with a smaller input.
 *
 * Every recursive solution needs:
 *   1. Base case     → when to STOP
 *   2. Recursive case → call itself with simpler input
 *
 * Without base case → StackOverflowError
 *
 * Print n → 1:
 *   print(n) → print n, then print(n-1)
 *   stop when n == 0
 *
 * Dry run print(3):
 *   print(3) → 3, print(2)
 *   print(2) → 2, print(1)
 *   print(1) → 1, print(0)
 *   print(0) → stop
 *
 * Time: O(n)   Space: O(n) call stack
 */
public class PrintNumbers {

    public static void main(String[] args) {
        System.out.print("n to 1: ");
        printNto1(5);
        System.out.println();

        System.out.print("1 to n: ");
        print1toN(5);
        System.out.println();
    }

    private static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    private static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1); // go down first
        System.out.print(n + " "); // print while returning
    }
}
