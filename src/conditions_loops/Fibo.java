package conditions_loops;

import java.util.Scanner;

/**
 * Find the nth Fibonacci number.
 *
 * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, ...
 * Rule:     each term = sum of the previous two
 *
 * Index:    n = 0 → 0
 *           n = 1 → 1
 *           n = 2 → 1
 *           n = 3 → 2
 *           n = 4 → 3
 *           n = 5 → 5
 *           n = 6 → 8
 *
 * Idea: keep only the last two terms (a and b) and walk forward until n.
 */
public class Fibo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // which Fibonacci number you want (0-based)

        System.out.println(nthFibo(n));
    }

    /**
     * Returns the nth Fibonacci number using a while loop.
     *
     * Variables:
     *   a     → previous term (Fib of count - 1)
     *   b     → current term  (Fib of count)
     *   count → how far we have reached in the sequence
     *   temp  → holds old b so we don't lose it when updating
     *
     * Each lap of the loop:
     *   1. save old b in temp
     *   2. new b = old b + a   (next Fibonacci)
     *   3. a becomes old b     (slide the window forward)
     *   4. count++
     *
     * Dry run for n = 5 (want Fib(5) = 5):
     *   start: a=0, b=1, count=2
     *   count=2 → temp=1, b=1+0=1, a=1, count=3   → Fib(2)=1
     *   count=3 → temp=1, b=1+1=2, a=1, count=4   → Fib(3)=2
     *   count=4 → temp=2, b=2+1=3, a=2, count=5   → Fib(4)=3
     *   count=5 → temp=3, b=3+2=5, a=3, count=6   → Fib(5)=5
     *   stop (count > n) → print b → 5
     */
    private static int nthFibo(int n) {
        // Base cases: no need to loop
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;      // Fib(0)
        int b = 1;      // Fib(1)
        int count = 2;  // we already know Fib(0) and Fib(1)

        while (count <= n) {
            int temp = b;   // remember current term
            b = b + a;      // next term
            a = temp;       // previous term becomes what b used to be
            count++;
        }

        return b; // b is now Fib(n)
    }
}
