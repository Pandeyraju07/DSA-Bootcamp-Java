package pattern;

/**
 * INTERVIEW FAVORITE: Floyd's Triangle
 *
 * n = 5
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 * Keep a running counter; each row i prints i numbers.
 *
 * Dry run:
 *   start num=1
 *   row1 → 1
 *   row2 → 2 3
 *   row3 → 4 5 6
 */
public class FloydTriangle {

    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
