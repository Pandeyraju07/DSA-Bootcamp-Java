package binary_search;

/**
 * Concept: Peak Index in a Mountain Array.
 *
 * TOP INTERVIEW / LEETCODE-STYLE:
 *   Mountain / bitonic array: increases then decreases.
 *   Find the peak index (largest element).
 *
 * Example:
 *   arr = [0, 2, 1, 0] → peak index = 1 (value 2)
 *   arr = [1, 3, 5, 7, 6, 4, 2] → peak index = 3 (value 7)
 *
 * Idea:
 *   if arr[mid] > arr[mid+1] → you are on descending slope → peak is mid or left
 *     end = mid
 *   else → ascending slope → peak is right
 *     start = mid + 1
 *   loop until start == end → that index is peak
 *
 * Dry run [1,3,5,7,6,4,2]:
 *   mid points move until start=end=3
 *
 * Time: O(log n)   Space: O(1)
 */
public class PeakIndexMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int peak = peakIndex(arr);
        System.out.println("Peak index = " + peak + ", value = " + arr[peak]);
    }

    private static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // descending part — peak is at mid or to the left
                end = mid;
            } else {
                // ascending part — peak is to the right
                start = mid + 1;
            }
        }
        return start; // or end — both same
    }
}
