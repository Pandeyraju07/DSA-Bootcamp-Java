package pattern;

/**
 * TOP INTERVIEW FAVORITE: Pascal's Triangle
 *
 * n = 5
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 *
 * Value formula for C(i, j):
 *   C = C * (i-j) / j   while building row i (0-based tricks exist)
 *
 * Easy revision way (row by row):
 *   each row starts/ends with 1
 *   middle = sum of two parents from previous row
 *
 * This file uses nCr formula style with long to reduce overflow for small n.
 *
 * Dry run row i=4 (1-based values):
 *   C(4,0)=1, C(4,1)=4, C(4,2)=6, C(4,3)=4, C(4,4)=1
 */
public class PascalTriangle {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // spaces for centering
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }

    /** nCr = n! / (r! * (n-r)!) computed iteratively */
    private static long nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }
        return res;
    }
}
