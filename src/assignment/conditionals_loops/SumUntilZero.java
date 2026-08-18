package assignment.conditionals_loops;

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = sumUntilZero(input);

        System.out.println("The sum is " + sum);
    }

    public static int sumUntilZero(Scanner input) {
        int sum = 0;

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        return sum;
    }
}