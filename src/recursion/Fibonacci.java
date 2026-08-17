package recursion;

/**
 * Concept: Fibonacci with recursion.
 *
 * Rule:
 *   fib(0)=0, fib(1)=1
 *   fib(n)=fib(n-1)+fib(n-2)
 *
 * Dry run fib(5):
 *   fib(5)=fib(4)+fib(3) → ... → 5
 *
 * Interview note:
 *   Naive recursion is O(2^n) — many repeated calls.
 *   Learning recursion: OK. Production: use loop / DP.
 *
 * Time: O(2^n)   Space: O(n) stack
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("fib(6) = " + fib(6));
        System.out.print("Series: ");
        for (int i = 0; i <= 6; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
