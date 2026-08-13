package searching;

/**
 * Concept: linear search only inside a range.
 *
 * INTERVIEW FOLLOW-UP:
 *   Search target in indexes [start, end] inclusive.
 *   Do NOT scan the whole array.
 *
 * Dry run arr=[18, 12, -7, 3, 14, 28], target=14, start=1, end=4:
 *   check 12, -7, 3, 14 → found at index 4
 *
 * Why asked:
 *   Shows you can limit the scan window.
 *
 * Time: O(end - start + 1)   Space: O(1)
 */
public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        int start = 1;
        int end = 4;

        System.out.println("Index in range = " + search(arr, target, start, end));
    }

    private static int search(int[] arr, int target, int start, int end) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (start < 0 || end >= arr.length || start > end) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
