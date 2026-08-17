package recursion;

import java.util.Arrays;

/**
 * Concept: Merge Sort — divide and conquer recursion.
 *
 * TOP INTERVIEW FAVORITE:
 *   1) Split array into two halves
 *   2) Sort left, sort right (recursively)
 *   3) Merge the two sorted halves
 *
 * Dry run [5, 4, 3, 2, 1]:
 *   split until single elements
 *   merge pairs → sorted subarrays
 *   finally [1, 2, 3, 4, 5]
 *
 * Time: O(n log n)   Space: O(n)
 *
 * Why interviewers like it:
 *   Clear recursion + merge logic + complexity discussion.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }
        while (i < first.length) {
            mix[k++] = first[i++];
        }
        while (j < second.length) {
            mix[k++] = second[j++];
        }
        return mix;
    }
}
