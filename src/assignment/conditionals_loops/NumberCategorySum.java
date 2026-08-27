package assignment.conditionals_loops;

import java.util.Scanner;

public class NumberCategorySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                negativeSum += num;
            } else if (num % 2 == 0) {
                positiveEvenSum += num;
            } else {
                positiveOddSum += num;
            }
        }

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);
    }
}