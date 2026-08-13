package searching;

/**
 * Concept: find minimum using the same linear-scan pattern.
 *
 * INTERVIEW LINE:
 *   "Min / max is just linear search with comparison."
 *
 * Approach:
 *   ans = arr[0]
 *   walk i = 1 .. n-1
 *   if arr[i] < ans → ans = arr[i]
 *
 * Dry run arr=[18, 12, -7, 3, 14, 28]:
 *   ans=18
 *   12 → ans=12
 *   -7 → ans=-7
 *   3,14,28 → no change
 *   → -7
 *
 * Time: O(n)   Space: O(1)
 */
public class FindMinimum {

    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println("Min = " + findMin(arr));
    }

    private static int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
