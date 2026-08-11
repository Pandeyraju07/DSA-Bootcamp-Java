package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Concept: take array input + print array.
 *
 * Ways to print:
 *   1. normal for loop (uses index)
 *   2. for-each loop (values only)
 *   3. Arrays.toString(arr)  → quick debug print
 *
 * PROBLEM:
 *   Read n integers into an array and print them in all 3 ways.
 *
 * Sample:
 *   Enter size: 4
 *   Enter 4 numbers: 10 20 30 40
 *   for-loop: 10 20 30 40
 *   for-each: 10 20 30 40
 *   toString: [10, 20, 30, 40]
 */
public class InputAndPrint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // store at index i
        }

        System.out.print("for-loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("for-each: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("toString: " + Arrays.toString(arr));
    }
}
