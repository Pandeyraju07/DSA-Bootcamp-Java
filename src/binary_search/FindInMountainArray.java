package binary_search;

/**
 * Concept: Find target in a Mountain Array.
 *
 * INTERVIEW HARD FOLLOW-UP:
 *   Array increases then decreases. Find ANY index of target.
 *
 * Approach:
 *   1) Find peak index
 *   2) Binary search on ascending side [0 .. peak]
 *   3) If not found, order-agnostic BS on descending side [peak+1 .. n-1]
 *
 * Example:
 *   arr = [1, 2, 3, 4, 5, 3, 1], target = 3 → index 2 (or 5)
 *
 * Time: O(log n)   Space: O(1)
 */
public class FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        System.out.println("Index = " + findInMountain(arr, target));
    }

    private static int findInMountain(int[] arr, int target) {
        int peak = peakIndex(arr);

        // try ascending side first
        int index = orderAgnosticSearch(arr, target, 0, peak);
        if (index != -1) {
            return index;
        }
        // then descending side
        return orderAgnosticSearch(arr, target, peak + 1, arr.length - 1);
    }

    private static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int orderAgnosticSearch(int[] arr, int target, int start, int end) {
        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ascending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
