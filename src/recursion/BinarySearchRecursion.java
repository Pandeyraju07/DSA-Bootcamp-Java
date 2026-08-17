package recursion;

/**
 * Concept: Binary search written recursively.
 *
 * Same idea as iterative BS:
 *   mid = start + (end-start)/2
 *   if equal → found
 *   if target > mid → search right half
 *   else           → search left half
 *
 * Dry run arr=[1,2,3,4,55,66,78], target=66:
 *   mid points move until 66 found
 *
 * Time: O(log n)   Space: O(log n) stack
 */
public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        System.out.println("Index = " + search(arr, 66, 0, arr.length - 1));
    }

    private static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
}
