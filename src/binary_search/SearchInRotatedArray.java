package binary_search;

/**
 * Concept: Search in Rotated Sorted Array.
 *
 * TOP INTERVIEW FAVORITE:
 *   Sorted array is rotated at some pivot. Find target index.
 *
 * Example:
 *   arr = [4, 5, 6, 7, 0, 1, 2], target = 0 → index 4
 *
 * Approach:
 *   1) Find pivot (largest element / rotation point)
 *   2) If target == pivot value → return pivot
 *   3) If target >= arr[0] → search left half [0 .. pivot-1]
 *      else                → search right half [pivot+1 .. n-1]
 *
 * Pivot property:
 *   arr[mid] > arr[mid+1] → mid is pivot
 *   arr[mid] < arr[mid-1] → mid-1 is pivot
 *
 * Time: O(log n)   Space: O(1)
 */
public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Index = " + search(arr, target));
    }

    private static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1: mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2: mid-1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case 3 & 4: shrink side that may contain pivot
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // no rotation
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
