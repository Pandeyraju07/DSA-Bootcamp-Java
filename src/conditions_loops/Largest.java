package conditions_loops;

import java.util.Scanner;

/**
 * Keep reading numbers and track the largest.
 * Stop when user enters 0.
 *
 * Concepts used:
 *   while loop
 *   if to update max
 *   sentinel value (0) to end input
 *
 * Dry run inputs: 3, 9, 2, 15, 0
 *   max starts = Integer.MIN_VALUE (or first number)
 *   3  → max = 3
 *   9  → max = 9
 *   2  → max stays 9
 *   15 → max = 15
 *   0  → stop → print 15
 */
public class Largest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers (0 to stop):");

        int max = Integer.MIN_VALUE;
        int num = in.nextInt();

        while (num != 0) {
            if (num > max) {
                max = num; // found a bigger one
            }
            num = in.nextInt();
        }

        System.out.println("Largest = " + max);
    }
}
