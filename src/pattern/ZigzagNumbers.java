package pattern;

/**
 * INTERVIEW-LEVEL: Up then down number triangle
 *
 * n = 4
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13
 * 14 15
 * 16
 *
 * Upper: row i prints i numbers
 * Lower: row i prints (n-1), (n-2), ... 1 numbers
 * Keep one running counter across both halves.
 *
 * Dry run:
 *   upper ends at 10, counter=11
 *   next row prints 3 nums: 11 12 13
 *   then 14 15
 *   then 16
 */
public class ZigzagNumbers {

    public static void main(String[] args) {
        int n = 4;
        int num = 1;

        // upper
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // lower
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
