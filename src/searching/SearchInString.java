package searching;

/**
 * Concept: linear search on a String (characters).
 *
 * INTERVIEW VARIANT:
 *   Does target character exist in the string?
 *
 * Tip:
 *   String.charAt(i) ≈ arr[i] for characters
 *
 * Dry run str="kunal", target='a':
 *   k no → u no → n no → a yes → true
 *
 * Time: O(n)   Space: O(1)
 */
public class SearchInString {

    public static void main(String[] args) {
        String name = "kunal";
        char target = 'a';

        System.out.println("'" + target + "' in \"" + name + "\" ? " + search(name, target));
    }

    private static boolean search(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
