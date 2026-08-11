package strings;

/**
 * Concept: build a new string from end → start.
 *
 * INTERVIEW FAVORITE:
 *   Reverse a string.
 *
 * Approaches:
 *   1) StringBuilder.reverse()   — practical
 *   2) two pointers on char[]    — shows understanding
 *
 * Example: "hello" → "olleh"
 *
 * Dry run two-pointer on ['h','e','l','l','o']:
 *   swap h↔o → o e l l h
 *   swap e↔l → o l l e h
 *   stop
 *
 * Time: O(n)   Space: O(n) for new string (or O(1) extra on char[])
 */
public class ReverseString {

    public static void main(String[] args) {
        String s = "hello";

        System.out.println("Original: " + s);
        System.out.println("Builder:  " + reverseWithBuilder(s));
        System.out.println("Two ptr:  " + reverseTwoPointer(s));
    }

    private static String reverseWithBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static String reverseTwoPointer(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
