package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Concept: 2D arrays (matrix) — array of arrays.
 *
 * Syntax:
 *   int[][] matrix = new int[rows][cols];
 *
 * Memory idea:
 *   matrix reference → points to array of row references
 *   each row reference → points to an int array (columns)
 *
 * PROBLEM 1: input a matrix and print it
 * PROBLEM 2 (interview-ish): search a target in the matrix
 *
 * Sample matrix 3x3:
 *   1 2 3
 *   4 5 6
 *   7 8 9
 * target 5 → found at (1,1)
 */
public class TwoDArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = in.nextInt();
        System.out.print("Enter cols: ");
        int cols = in.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        printMatrix(matrix);

        System.out.print("\nEnter target to search: ");
        int target = in.nextInt();

        int[] pos = search(matrix, target);
        if (pos[0] != -1) {
            System.out.println("Found at row=" + pos[0] + ", col=" + pos[1]);
        } else {
            System.out.println("Not found");
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    /**
     * Linear search in 2D.
     * Dry run target=5 on:
     *   [1,2,3]
     *   [4,5,6]
     *   → i=1,j=1 match → {1,1}
     */
    private static int[] search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
