package conditions_loops;

import java.util.Scanner;

/**
 * Simple calculator using while + if / else if.
 *
 * Flow:
 *   1. keep asking for an operator
 *   2. if operator is + - * / % → read two numbers and compute
 *   3. if operator is x / X → exit the loop
 *   4. otherwise → invalid operation
 *
 * Loop style: while (true) + break
 *   → infinite loop on purpose; we stop only when user types x / X
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        runCalculator(input);
    }

    /**
     * Main loop of the calculator.
     *
     * Variables:
     *   op   → operator character (+, -, *, /, %, x)
     *   num1 → first number
     *   num2 → second number
     *   ans  → result of the last valid operation
     *
     * Dry run:
     *   op = '+'
     *   num1 = 10, num2 = 3
     *   ans = 13 → print 13
     *   op = 'x' → break → program ends
     */
    private static void runCalculator(Scanner input) {
        int ans = 0;

        while (true) {
            System.out.println("Enter the Operator: ");
            char op = input.next().trim().charAt(0);

            if (isArithmeticOperator(op)) {
                System.out.println("Enter the two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                ans = calculate(op, num1, num2);
                System.out.println(ans);
            } else if (op == 'x' || op == 'X') {
                break; // exit the infinite while loop
            } else {
                System.out.println("Invalid operation!!");
            }
        }
    }

    /**
     * true when op is one of: + - * / %
     */
    private static boolean isArithmeticOperator(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/' || op == '%';
    }

    /**
     * Performs one arithmetic operation.
     *
     *   + → add
     *   - → subtract
     *   * → multiply
     *   / → divide (integer division)
     *   % → remainder
     *
     * Note: / and % assume num2 is not zero in this simple version.
     */
    private static int calculate(char op, int num1, int num2) {
        if (op == '+') {
            return num1 + num2;
        }
        if (op == '-') {
            return num1 - num2;
        }
        if (op == '*') {
            return num1 * num2;
        }
        if (op == '/') {
            return num1 / num2;
        }
        // op == '%'
        return num1 % num2;
    }
}
