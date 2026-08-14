package binary_search;

/**
 * Concept: next greatest letter (circular sorted letters).
 *
 * TOP INTERVIEW / LEETCODE-STYLE:
 *   Given sorted letters and a target character,
 *   return the smallest letter STRICTLY greater than target.
 *   Letters wrap around (after 'z' comes first letter).
 *
 * Example:
 *   letters = ['c', 'f', 'j'], target = 'a' → 'c'
 *   letters = ['c', 'f', 'j'], target = 'c' → 'f'
 *   letters = ['c', 'f', 'j'], target = 'j' → 'c' (wrap)
 *
 * Idea:
 *   Same as ceiling, but ignore equals (strictly greater)
 *   and use start % n for wrap-around.
 *
 * Time: O(log n)   Space: O(1)
 */
public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};

        System.out.println("Next after 'a' = " + nextGreatestLetter(letters, 'a'));
        System.out.println("Next after 'c' = " + nextGreatestLetter(letters, 'c'));
        System.out.println("Next after 'j' = " + nextGreatestLetter(letters, 'j'));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                // equal OR target larger → go right (need STRICTLY greater)
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
