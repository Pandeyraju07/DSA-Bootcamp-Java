package binary_search;

/**
 * Concept: Floor of a number (binary search variant).
 *
 * INTERVIEW FAVORITE:
 *   Floor = greatest element in array that is <= target.
 *
 * Example:
 *   arr = [2, 3, 5, 9, 14, 16, 18], target = 15
 *   → floor = 14 (index 4)
 *
 * Idea:
 *   Same binary search loop.
 *   When loop ends, end points to the floor index.
 *   If target < first element → no floor → -1
 *
 * Dry run target=15:
 *   finally end lands on index of 14
 *
 * Time: O(log n)   Space: O(1)
 */
public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int index = floor(arr, target);
        if (index != -1) {
            System.out.println("Floor of " + target + " = " + arr[index] + " at index " + index);
        } else {
            System.out.println("No floor exists");
        }
    }

    private static int floor(int[] arr, int target) {
        if (target < arr[0]) {
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
        // end is the previous smaller element index
        return end;
    }
}
