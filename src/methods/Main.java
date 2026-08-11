package methods;

import java.util.Scanner;

/**
 * Why methods exist — take 2 numbers and print their sum.
 *
 * Problem without methods:
 *   The same 5–6 lines (ask num1, ask num2, add, print)
 *   get copied again and again. Hard to read, hard to change.
 *
 * Fix with a method:
 *   Write the logic ONCE in sumTwoNumbers().
 *   Call it whenever you need a sum.
 *
 * Method idea:
 *   name        → what it does
 *   parameters  → inputs it needs
 *   body        → the work
 *   return/void → gives a value back, or just does something (void)
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Call the same method many times — no copy-paste of the logic
        sumTwoNumbers(in);
        sumTwoNumbers(in);
        sumTwoNumbers(in);

        // Or loop if you want N sums
        System.out.println("\n--- using a loop to call the method ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Sum #" + i);
            sumTwoNumbers(in);
        }

        // Method that RETURNS a value (caller decides what to do with it)
        System.out.println("\n--- method that returns a value ---");
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();
        int result = add(a, b);
        System.out.println("The sum = " + result);
    }

    /**
     * Reads two ints from the scanner and prints their sum.
     *
     * Steps:
     *   1. ask for number 1
     *   2. ask for number 2
     *   3. add them
     *   4. print the result
     *
     * Dry run:
     *   Enter number 1: 10
     *   Enter number 2: 5
     *   sum = 10 + 5 = 15
     *   prints: The sum = 15
     *
     * Why pass Scanner in?
     *   So we create Scanner once in main and reuse it
     *   (instead of creating a new Scanner inside every call).
     */
    private static void sumTwoNumbers(Scanner in) {
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    /**
     * Same idea, but RETURNS the sum instead of printing.
     * Useful when the caller wants to use the value later.
     *
     * Example use:
     *   int result = add(3, 4);  // result becomes 7
     */
    private static int add(int num1, int num2) {
        return num1 + num2;
    }
}
