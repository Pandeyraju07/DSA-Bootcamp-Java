package binary_search;

/**
 * Concept: binary search on an "infinite" sorted array.
 *
 * INTERVIEW CLASSIC:
 *   You cannot use arr.length. Find a window [start, end]
 *   that may contain target, then binary search inside it.
 *
 * Idea:
 *   start = 0, end = 1
 *   while target > arr[end]
 *     newStart = end + 1
 *     end = end + (end - start + 1) * 2   // double the box
 *     start = newStart
 *   then normal binary search in [start, end]
 *
 * Dry run target=16 on [3,5,7,9,10,90,100,130,140,160,170]:
 *   box grows: [0,1] → [2,5] → [6,13] (clamped by real array in demo)
 *   then BS finds index of 16 if present
 *
 * Note: demo uses a finite array but does NOT rely on length for window growth
 *       (with a safe bound so index doesn't crash in learning code).
 *
 * Time: O(log n)   Space: O(1)
 */
public class InfiniteArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println("Index = " + findInInfinite(arr, target));
    }

    private static int findInInfinite(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // grow the window exponentially until target can fit
        while (end < arr.length - 1 && target > arr[end]) {
            int newStart = end + 1;
            // double the box size: end = end + size*2
            end = end + (end - start + 1) * 2;
            if (end >= arr.length) {
                end = arr.length - 1; // learning-safe clamp
            }
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
