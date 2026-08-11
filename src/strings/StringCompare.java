package strings;

/**
 * Concept: comparing Strings.
 *
 * INTERVIEW FAVORITE:
 *   ==        → compares REFERENCES (same object in memory?)
 *   equals()  → compares CONTENT (same characters?)
 *
 * String pool:
 *   literals with same content can share one pool object.
 *   new String("x") always creates a new heap object.
 *
 * PROBLEM:
 *   Check if two strings are equal by content (ignore case option).
 */
public class StringCompare {

    public static void main(String[] args) {
        equalsVsOperator();
        equalsIgnoreCaseProblem();
    }

    /**
     * Dry run:
     *   a and b are both literals "Java" → may point to same pool object
     *   c is new String("Java") → different object
     *   a == b  → true (same pool ref, usually)
     *   a == c  → false
     *   a.equals(c) → true (same content)
     */
    private static void equalsVsOperator() {
        System.out.println("=== 1. == vs equals ===");

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b        : " + (a == b));
        System.out.println("a == c        : " + (a == c));
        System.out.println("a.equals(c)   : " + a.equals(c));
    }

    /**
     * PROBLEM: compare two names ignoring case.
     *
     * "RAJU" vs "raju" → equal
     */
    private static void equalsIgnoreCaseProblem() {
        System.out.println("\n=== 2. PROBLEM: ignore-case equal ===");

        String s1 = "RAJU";
        String s2 = "raju";

        System.out.println("equals            : " + s1.equals(s2));
        System.out.println("equalsIgnoreCase  : " + s1.equalsIgnoreCase(s2));
    }
}
