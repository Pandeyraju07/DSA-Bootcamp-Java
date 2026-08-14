package binary_search;

/**
 * Concept: Binary Search — repeatedly cut the search space in half.
 *
 * Prerequisite:
 *   Array must be SORTED (ascending here).
 *
 * Core idea:
 *   start = 0, end = n-1
 *   while start <= end
 *     mid = start + (end - start) / 2   // avoids overflow
 *     if arr[mid] == target → return mid
 *     if target > arr[mid] → search right (start = mid + 1)
 *     else                 → search left  (end = mid - 1)
 *   return -1
 *
 * Dry run arr=[2, 4, 6, 9, 11, 12, 14, 20, 36, 48], target=36:
 *   start=0,end=9 → mid=4 → 11 < 36 → start=5
 *   start=5,end=9 → mid=7 → 20 < 36 → start=8
 *   start=8,end=9 → mid=8 → 36 == 36 → return 8
 *
 * Time: O(log n)   Space: O(1)
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;

        int index = search(arr, target);
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found");
        }
    }

    private static int search(int[] arr, int target) {
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
        return -1;
    }
}
