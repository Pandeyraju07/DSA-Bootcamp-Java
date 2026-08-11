package pattern;

/**
 * INTERVIEW FAVORITE: 0-1 Triangle
 *
 * n = 5
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 *
 * Rule often used:
 *   if (i + j) is even → 1 else 0
 *   (with 1-based i,j) — OR start each row based on i.
 *
 * Dry run i=3:
 *   j1: 3+1=4 even → 1
 *   j2: 3+2=5 odd  → 0
 *   j3: 3+3=6 even → 1
 */
public class BinaryTriangle {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
