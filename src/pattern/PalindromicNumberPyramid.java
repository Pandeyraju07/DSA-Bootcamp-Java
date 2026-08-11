package pattern;

/**
 * TOP INTERVIEW FAVORITE: Palindromic Number Pyramid
 *
 * n = 5
 *         1
 *       2 1 2
 *     3 2 1 2 3
 *   4 3 2 1 2 3 4
 * 5 4 3 2 1 2 3 4 5
 *
 * For row i:
 *   spaces = n - i
 *   left descending: i..1
 *   right ascending: 2..i
 *
 * Dry run i=3:
 *   spaces=2
 *   left: 3 2 1
 *   right: 2 3
 *   → 3 2 1 2 3
 */
public class PalindromicNumberPyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // left side: i → 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // right side: 2 → i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
