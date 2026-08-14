package binary_search;

/**
 * Concept: Order-Agnostic Binary Search.
 *
 * INTERVIEW FOLLOW-UP:
 *   Array is sorted, but you don't know if ASC or DESC.
 *
 * Idea:
 *   Compare arr[0] and arr[n-1]
 *     ascending  → arr[0] < arr[n-1]
 *     descending → arr[0] > arr[n-1]
 *   Then apply binary search in that direction.
 *
 * Dry run DESC arr=[90, 75, 18, 12, 6, 4, 3, 1], target=75:
 *   ascending? false
 *   mid finds 18 → target 75 is larger → go LEFT in desc array
 *   → found at index 1
 *
 * Time: O(log n)   Space: O(1)
 */
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] asc = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] desc = {90, 75, 18, 12, 6, 4, 3, 1};

        System.out.println("ASC  → index = " + search(asc, 36));
        System.out.println("DESC → index = " + search(desc, 75));
    }

    private static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
                    end = mid - 1; // larger values are on the left
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
