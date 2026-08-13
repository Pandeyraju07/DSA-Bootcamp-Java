package searching;

/**
 * Concept: Linear Search — check elements one by one.
 *
 * When to use:
 *   Unsorted data, no HashMap / binary search available.
 *
 * Core idea:
 *   for each index i
 *     if arr[i] == target → return i
 *   return -1
 *
 * Time: O(n)   Space: O(1)
 * Best case O(1) if first element matches.
 *
 * Dry run arr=[4, 2, 7, 1, 9], target=7:
 *   i=0 → 4 no
 *   i=1 → 2 no
 *   i=2 → 7 yes → return 2
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int target = 7;

        int index = search(arr, target);
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found");
        }
    }

    private static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
