package methods;

/**
 * Recursion — a method calling itself.
 *
 * Every recursive solution needs:
 *   1. Base case     → when to STOP (most important)
 *   2. Recursive case → call itself with a smaller / simpler input
 *
 * Without a base case → StackOverflowError
 *
 * This file: factorial + print numbers (easy revision examples).
 * Interview twin of loops: many loop problems can be done recursively.
 */
public class RecursionBasics {

    public static void main(String[] args) {
        printExample();
        factorialExample();
        fibonacciExample();
    }

    /**
     * Print n to 1 using recursion.
     *
     * Dry run print(3):
     *   print(3) → print 3, call print(2)
     *   print(2) → print 2, call print(1)
     *   print(1) → print 1, call print(0)
     *   print(0) → base case → stop
     */
    private static void printExample() {
        System.out.println("=== 1. PRINT n to 1 ===");
        print(5);
        System.out.println();
    }

    private static void print(int n) {
        if (n == 0) { // base case
            return;
        }
        System.out.print(n + " ");
        print(n - 1); // recursive case
    }

    /**
     * Factorial: n! = n * (n-1)!
     * 0! = 1 (base)
     *
     * Dry run fact(4):
     *   4 * fact(3)
     *   4 * 3 * fact(2)
     *   4 * 3 * 2 * fact(1)
     *   4 * 3 * 2 * 1 * fact(0)
     *   4 * 3 * 2 * 1 * 1 = 24
     */
    private static void factorialExample() {
        System.out.println("\n=== 2. FACTORIAL ===");
        System.out.println("5! = " + fact(5));
    }

    private static int fact(int n) {
        if (n == 0 || n == 1) { // base case
            return 1;
        }
        return n * fact(n - 1); // recursive case
    }

    /**
     * Fibonacci with recursion (simple, not optimized).
     *
     * fib(0)=0, fib(1)=1
     * fib(n)=fib(n-1)+fib(n-2)
     *
     * Dry run fib(5):
     *   fib(5) = fib(4)+fib(3) → ... → 5
     *
     * Note: this recomputes a lot (inefficient). Good for learning recursion;
     * for performance use loop/DP later.
     */
    private static void fibonacciExample() {
        System.out.println("\n=== 3. FIBONACCI (recursive) ===");
        System.out.println("fib(6) = " + fib(6));
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
