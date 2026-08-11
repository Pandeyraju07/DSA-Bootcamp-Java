package arrays;

import java.util.Arrays;

/**
 * Concept: index mapping / reverse trick on arrays.
 *
 * INTERVIEW FAVORITE:
 *   Rotate array to the RIGHT by k steps.
 *
 * Example:
 *   arr = [1, 2, 3, 4, 5, 6, 7], k = 3
 *   → [5, 6, 7, 1, 2, 3, 4]
 *
 * Clean O(n) trick (reverse method):
 *   1. reverse whole array
 *   2. reverse first k elements
 *   3. reverse remaining n-k elements
 *
 * Dry run:
 *   [1,2,3,4,5,6,7]
 *   reverse all     → [7,6,5,4,3,2,1]
 *   reverse first 3 → [5,6,7,4,3,2,1]
 *   reverse rest    → [5,6,7,1,2,3,4]
 *
 * Time: O(n)   Space: O(1)
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Before: " + Arrays.toString(arr));
        rotateRight(arr, k);
        System.out.println("After:  " + Arrays.toString(arr));
    }

    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k >= n

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
