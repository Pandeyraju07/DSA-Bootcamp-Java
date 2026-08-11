package arrays;

/**
 * Concept: traverse array + track answer variable.
 *
 * INTERVIEW FAVORITE:
 *   Find maximum and minimum element in an array.
 *
 * Approach:
 *   max = arr[0], min = arr[0]
 *   walk i = 1 .. n-1
 *   update max/min when needed
 *
 * Time: O(n)   Space: O(1)
 *
 * Dry run arr = [3, 9, 1, 15, 7]:
 *   max=3,min=3
 *   9  → max=9
 *   1  → min=1
 *   15 → max=15
 *   7  → no change
 *   → max=15, min=1
 */
public class MaxMin {

    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 15, 7};

        System.out.println("Max = " + findMax(arr));
        System.out.println("Min = " + findMin(arr));
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
