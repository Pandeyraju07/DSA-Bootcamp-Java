package binary_search;

import java.util.Arrays;

/**
 * Concept: find first and last position of target in sorted array.
 *
 * TOP INTERVIEW / LEETCODE-STYLE:
 *   Return [firstIndex, lastIndex]. If not found → [-1, -1]
 *
 * Example:
 *   nums = [5, 7, 7, 8, 8, 10], target = 8 → [3, 4]
 *
 * Idea:
 *   Run binary search TWICE
 *     1) findFirst = true  → keep going left after a match
 *     2) findFirst = false → keep going right after a match
 *
 * Dry run target=8:
 *   first pass → index 3
 *   second pass → index 4
 *
 * Time: O(log n)   Space: O(1)
 */
public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println("Range = " + Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(nums, target, false);
        }
        return ans;
    }

    private static int binarySearch(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1; // look further left
                } else {
                    start = mid + 1; // look further right
                }
            }
        }
        return ans;
    }
}
