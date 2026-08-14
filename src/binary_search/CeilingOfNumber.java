package binary_search;

/**
 * Concept: Ceiling of a number (binary search variant).
 *
 * INTERVIEW FAVORITE:
 *   Ceiling = smallest element in array that is >= target.
 *
 * Example:
 *   arr = [2, 3, 5, 9, 14, 16, 18], target = 15
 *   → ceiling = 16 (index 5)
 *
 * Idea:
 *   Same binary search loop.
 *   When loop ends, start points to the ceiling index.
 *   If target > last element → no ceiling → -1
 *
 * Dry run target=15:
 *   finally start lands on index of 16
 *
 * Time: O(log n)   Space: O(1)
 */
public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int index = ceiling(arr, target);
        if (index != -1) {
            System.out.println("Ceiling of " + target + " = " + arr[index] + " at index " + index);
        } else {
            System.out.println("No ceiling exists");
        }
    }

    private static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

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
        // start is the next greater element index
        return start;
    }
}
