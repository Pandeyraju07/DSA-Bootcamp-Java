package arrays;

/**
 * Concept: XOR property on array elements.
 *
 * INTERVIEW FAVORITE:
 *   Every element appears twice except one. Find the unique element.
 *
 * Example:
 *   [2, 3, 2, 4, 4] → unique = 3
 *
 * Why XOR works:
 *   a ^ a = 0
 *   a ^ 0 = a
 *   XOR is commutative/associative
 *   so pairs cancel out, unique remains.
 *
 * Dry run:
 *   0 ^ 2 ^ 3 ^ 2 ^ 4 ^ 4
 *   → ((2^2) ^ (4^4) ^ 3)
 *   → (0 ^ 0 ^ 3) → 3
 *
 * Time: O(n)   Space: O(1)
 */
public class FindUnique {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 4};
        System.out.println("Unique = " + findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }
}
