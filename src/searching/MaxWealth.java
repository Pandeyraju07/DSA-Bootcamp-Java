package searching;

/**
 * Concept: linear scan on each row of a 2D array.
 *
 * TOP INTERVIEW / LEETCODE-STYLE:
 *   Richest Customer Wealth
 *
 *   accounts[i][j] = money of customer i in bank j
 *   wealth(customer) = sum of that row
 *   return the maximum wealth
 *
 * Example:
 *   [[1, 5],
 *    [7, 3],
 *    [3, 5]]
 *
 * Dry run:
 *   row0 = 6
 *   row1 = 10 → ans = 10
 *   row2 = 8
 *   → 10
 *
 * Still linear search / linear scan — just on a matrix.
 * Time: O(customers * banks)   Space: O(1)
 */
public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println("Max wealth = " + maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] customer : accounts) {
            int sum = 0;
            for (int money : customer) {
                sum += money;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
