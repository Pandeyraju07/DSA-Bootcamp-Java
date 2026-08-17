package recursion;

import java.util.Arrays;

/**
 * Concept: Bubble sort using recursion.
 *
 * INTERVIEW FOLLOW-UP:
 *   Same as pattern triangle idea + swap adjacent if out of order.
 *
 * Idea:
 *   For each row (pass), compare adjacent cols
 *   After one pass, largest settles at end
 *   Then recurse for row-1
 *
 * Dry run [4, 3, 2, 1]:
 *   pass → [3,2,1,4]
 *   pass → [2,1,3,4]
 *   pass → [1,2,3,4]
 *
 * Time: O(n^2)   Space: O(n) stack
 */
public class BubbleSortRecursion {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row - 1, 0);
        }
    }
}
