package searching;

import java.util.Arrays;

/**
 * Concept: linear search on a 2D array (matrix).
 *
 * INTERVIEW VARIANT:
 *   Return {row, col} of target, else {-1, -1}.
 *
 * Dry run target=37:
 *   [23, 4, 1]
 *   [18, 12, 3]
 *   [34, 37, 58] → {2, 1}
 *
 * Time: O(rows * cols)   Space: O(1)
 */
public class SearchIn2D {

    public static void main(String[] args) {
        int[][] matrix = {
                {23, 4, 1},
                {18, 12, 3},
                {34, 37, 58}
        };
        int target = 37;

        int[] pos = search(matrix, target);
        System.out.println("Position = " + Arrays.toString(pos));
    }

    private static int[] search(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
