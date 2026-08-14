package binary_search;

/**
 * Concept: Find how many times a sorted array was rotated.
 *
 * INTERVIEW FOLLOW-UP of rotated array:
 *   Rotation count = index of the smallest element
 *                  = pivotIndex + 1
 *
 * Example:
 *   Original: [1, 2, 3, 4, 5, 6, 7]
 *   Rotated:  [4, 5, 6, 7, 0, 1, 2]  (pivot=3 value 7)
 *   count = 4  (smallest 0 is at index 4 = pivot+1)
 *
 * If not rotated → count = 0
 *
 * Time: O(log n)   Space: O(1)
 */
public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotated " + countRotations(arr) + " times");
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1; // if pivot = -1 → 0 rotations
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
