package assignment.conditionals_loops;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n = input.nextInt();

        printFactors(n);
    }

    public static void printFactors(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}