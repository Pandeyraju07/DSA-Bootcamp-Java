package arrays;

import java.util.Arrays;

/**
 * Concept: two-pointer technique on arrays.
 *
 * INTERVIEW FAVORITE:
 *   Reverse an array in-place (no extra array).
 *
 * Idea:
 *   start = 0, end = n-1
 *   swap arr[start] and arr[end]
 *   start++, end--
 *   stop when start >= end
 *
 * Dry run [1, 2, 3, 4, 5]:
 *   swap 1↔5 → [5, 2, 3, 4, 1]
 *   swap 2↔4 → [5, 4, 3, 2, 1]
 *   start==end → stop
 *
 * Time: O(n)   Space: O(1)
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
