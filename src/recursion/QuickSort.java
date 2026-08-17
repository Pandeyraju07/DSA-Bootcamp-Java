package recursion;

import java.util.Arrays;

/**
 * Concept: Quick Sort — pick pivot, partition, recurse.
 *
 * TOP INTERVIEW FAVORITE:
 *   1) Choose pivot (here: middle element)
 *   2) Partition: smaller left, larger right
 *   3) Recurse on left and right parts
 *
 * Dry run [5, 4, 3, 2, 1] with mid pivot:
 *   after partitions, array becomes sorted in place
 *
 * Average Time: O(n log n)
 * Worst Time:   O(n^2)  (already sorted + bad pivot)
 * Space: O(log n) stack
 *
 * Interview tip:
 *   Explain partition clearly — that is the core.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now pivot is at correct index; sort two halves
        sort(nums, low, end);
        sort(nums, start, high);
    }
}
