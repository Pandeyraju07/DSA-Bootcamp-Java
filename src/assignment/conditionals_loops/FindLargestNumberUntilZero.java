package assignment.conditionals_loops;

import java.util.Scanner;

public class FindLargestNumberUntilZero {

    public static void main(String[] args) {

        int largest = findLargestNumberUntilZero();

        System.out.println("Largest number = " + largest);
    }

    public static int findLargestNumberUntilZero() {

        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        while (true) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }
}