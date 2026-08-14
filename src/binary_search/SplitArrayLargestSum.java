package binary_search;

/**
 * Concept: Binary search on ANSWER space (not on indexes).
 *
 * TOP INTERVIEW / LEETCODE HARD:
 *   Split Array Largest Sum
 *   Split array into m non-empty continuous subarrays
 *   Minimize the LARGEST subarray sum.
 *
 * Example:
 *   nums = [7, 2, 5, 10, 8], m = 2
 *   best split → [7,2,5] and [10,8]
 *   largest sums = 14 and 18 → answer = 18
 *
 * Idea (binary search on range):
 *   start = max element   (at least one piece must hold the biggest number)
 *   end   = sum of array  (one piece holds everything)
 *   mid   = candidate largest-sum capacity
 *   count how many pieces needed if capacity = mid
 *     if pieces > m → capacity too small → start = mid + 1
 *     else          → try smaller capacity → end = mid
 *
 * Dry run briefly:
 *   range shrinks until start == end → that value is the minimized largest sum
 *
 * Time: O(n log S) where S = sum(nums)   Space: O(1)
 */
public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        System.out.println("Minimized largest sum = " + splitArray(nums, m));
    }

    private static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num); // max element
            end += num;                   // total sum
        }

        // binary search on answer
        while (start < end) {
            int mid = start + (end - start) / 2;

            // how many pieces needed with capacity = mid?
            int pieces = 1;
            int sum = 0;
            for (int num : nums) {
                if (sum + num > mid) {
                    // start a new piece
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1; // need bigger capacity
            } else {
                end = mid; // try smaller capacity
            }
        }
        return end; // or start
    }
}
