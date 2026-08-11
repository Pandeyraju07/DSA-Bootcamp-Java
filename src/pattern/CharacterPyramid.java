package pattern;

/**
 * INTERVIEW COMMON: Character pyramid
 *
 * n = 5
 *         A
 *       A B A
 *     A B C B A
 *   A B C D C B A
 * A B C D E D C B A
 *
 * Similar to palindromic number pyramid, but with letters.
 * 'A' + k gives the k-th letter (0-based from A).
 *
 * Dry run i=3:
 *   left: C B A
 *   right: B C
 *   → C B A B C  (with spaces/centering)
 * Actually classic form often:
 *   A
 *   A B A
 *   ...
 * For row i (1-based): ascending A..(A+i-1), then descending (A+i-2)..A
 */
public class CharacterPyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // ascending A → ...
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            // descending ... → A
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
    }
}
