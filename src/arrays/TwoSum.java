package arrays;

import java.util.Arrays;

/**
 * Concept: nested loop / pair checking on arrays.
 *
 * TOP INTERVIEW FAVORITE:
 *   Two Sum — return indexes of two numbers that add up to target.
 *
 * Example:
 *   arr = [2, 7, 11, 15], target = 9
 *   → indexes [0, 1] because 2 + 7 = 9
 *
 * Approach here (beginner / brute force):
 *   for i
 *     for j = i+1
 *       if arr[i] + arr[j] == target → return {i, j}
 *
 * Dry run:
 *   i=0,j=1 → 2+7=9 → found
 *
 * Time: O(n^2)   Space: O(1)
 * (Later you can optimize with HashMap to O(n).)
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(arr, target);
        System.out.println("Indexes = " + Arrays.toString(ans));
    }

    private static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // not found
    }
}
