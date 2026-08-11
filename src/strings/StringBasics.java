package strings;

/**
 * String basics — sequence of characters.
 *
 * Create:
 *   String s1 = "Kunal";           // string pool (literal)
 *   String s2 = new String("Kunal"); // new object in heap
 *
 * Important:
 *   Strings are IMMUTABLE → cannot change characters in place.
 *   Any "change" creates a new String.
 *
 * Useful basics:
 *   length(), charAt(i), toCharArray()
 *
 * PROBLEM:
 *   Count vowels in a string.
 */
public class StringBasics {

    public static void main(String[] args) {
        createAndRead();
        immutabilityDemo();
        countVowelsProblem();
    }

    /**
     * Dry run:
     *   name = "Raju"
     *   length = 4
     *   charAt(0) = 'R'
     *   charAt(3) = 'u'
     */
    private static void createAndRead() {
        System.out.println("=== 1. CREATE + READ ===");

        String name = "Raju";
        System.out.println("String: " + name);
        System.out.println("length = " + name.length());
        System.out.println("charAt(0) = " + name.charAt(0));

        char[] letters = name.toCharArray();
        System.out.print("chars: ");
        for (char ch : letters) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    /**
     * Immutability: concat does not change original.
     *
     * Dry run:
     *   s = "Hi"
     *   s.concat(" Java") returns "Hi Java"
     *   but s is still "Hi" unless you assign it back
     */
    private static void immutabilityDemo() {
        System.out.println("\n=== 2. IMMUTABILITY ===");

        String s = "Hi";
        s.concat(" Java");                 // result ignored
        System.out.println("After concat without assign: " + s); // Hi

        s = s.concat(" Java");             // assign new string
        System.out.println("After assign: " + s); // Hi Java
    }

    /**
     * PROBLEM: count vowels (a e i o u), case-insensitive.
     *
     * Dry run "Education":
     *   E,u,a,i,o → 5 vowels
     */
    private static void countVowelsProblem() {
        System.out.println("\n=== 3. PROBLEM: count vowels ===");

        String s = "Education";
        System.out.println("Vowels in \"" + s + "\" = " + countVowels(s));
    }

    private static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
