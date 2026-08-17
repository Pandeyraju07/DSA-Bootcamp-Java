package assignment.conditionals_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(n);
        }
    }

        public static void printFibonacci(int n) {

            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");

                int c = a + b;
                a = b;
                b = c;
            }

    }
}
