package arrays;

import java.util.Arrays;

/**
 * Concept: read/write pointer while preserving order.
 *
 * INTERVIEW FAVORITE:
 *   Move all zeros to the end, keep non-zero order same.
 *
 * Example:
 *   [0, 1, 0, 3, 12] → [1, 3, 12, 0, 0]
 *
 * Idea:
 *   insertPos = where next non-zero should go
 *   scan i from 0..n-1
 *     if arr[i] != 0 → put it at insertPos, insertPos++
 *   fill remaining positions with 0
 *
 * Dry run:
 *   i=0 (0) skip
 *   i=1 (1) → arr[0]=1, insertPos=1
 *   i=2 (0) skip
 *   i=3 (3) → arr[1]=3, insertPos=2
 *   i=4 (12)→ arr[2]=12, insertPos=3
 *   fill arr[3], arr[4] with 0
 *
 * Time: O(n)   Space: O(1)
 */
public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(arr));
        moveZerosToEnd(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }

    private static void moveZerosToEnd(int[] arr) {
        int insertPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }

        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }
}
