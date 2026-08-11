package strings;

/**
 * Concept: ASCII / Character methods on each char.
 *
 * PROBLEM:
 *   Toggle case of each letter.
 *   Upper → lower, lower → upper, others unchanged.
 *
 * Example:
 *   "JaVa@123" → "jAvA@123"
 *
 * Dry run 'J':
 *   isUpperCase → toLowerCase → 'j'
 * Dry run 'a':
 *   isLowerCase → toUpperCase → 'A'
 *
 * Also shows why StringBuilder is used for building result.
 */
public class ToggleCase {

    public static void main(String[] args) {
        String s = "JaVa@123";
        System.out.println(s + " → " + toggle(s));
    }

    private static String toggle(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
