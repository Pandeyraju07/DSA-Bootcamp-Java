package arrays;

/**
 * Concept: running sum / Kadane's idea.
 *
 * TOP INTERVIEW FAVORITE:
 *   Maximum Subarray Sum (Kadane's Algorithm)
 *
 * Problem:
 *   Find contiguous subarray with the largest sum.
 *
 * Example:
 *   arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 *   best subarray = [4, -1, 2, 1] → sum = 6
 *
 * Idea (Kadane):
 *   currentSum = max(arr[i], currentSum + arr[i])
 *   bestSum    = max(bestSum, currentSum)
 *
 * Meaning:
 *   either start a new subarray at i,
 *   or extend the previous subarray.
 *
 * Dry run (first few):
 *   i=-2 → current=-2, best=-2
 *   i=1  → current=max(1, -2+1)=1, best=1
 *   i=-3 → current=max(-3, 1-3)=-2, best=1
 *   i=4  → current=max(4, -2+4)=4, best=4
 *   ...
 *   finally best = 6
 *
 * Time: O(n)   Space: O(1)
 */
public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max subarray sum = " + maxSubArray(arr));
    }

    private static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int bestSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            bestSum = Math.max(bestSum, currentSum);
        }

        return bestSum;
    }
}
