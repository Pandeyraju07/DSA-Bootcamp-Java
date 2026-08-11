package arrays;

/**
 * Concept: track more than one answer while traversing.
 *
 * INTERVIEW FAVORITE:
 *   Find the second largest distinct element.
 *
 * Example:
 *   [12, 35, 1, 10, 34, 1] → 34
 *
 * Idea:
 *   largest / second start as Integer.MIN_VALUE
 *   for each num:
 *     if num > largest → second = largest, largest = num
 *     else if num > second && num != largest → second = num
 *
 * Dry run:
 *   12 → largest=12
 *   35 → second=12, largest=35
 *   1  → no
 *   10 → no
 *   34 → second=34
 *   1  → no
 *   → 34
 *
 * Time: O(n)   Space: O(1)
 */
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest = " + secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return second;
    }
}
