package strings;

/**
 * Concept: common String methods.
 *
 * Handy methods:
 *   substring(start, end)  → end is exclusive
 *   indexOf / lastIndexOf
 *   contains / startsWith / endsWith
 *   replace / trim / split
 *   toLowerCase / toUpperCase
 *
 * PROBLEM:
 *   From email "raju.pandey@gmail.com"
 *     - print username (before @)
 *     - print domain (after @)
 *     - check if it is gmail
 */
public class StringMethodsPractice {

    public static void main(String[] args) {
        methodsDemo();
        emailPartsProblem();
    }

    private static void methodsDemo() {
        System.out.println("=== 1. COMMON METHODS ===");

        String s = "  Hello Java  ";
        System.out.println("trim       = [" + s.trim() + "]");
        System.out.println("substring  = " + "Hello".substring(1, 4)); // ell
        System.out.println("indexOf a  = " + "Java".indexOf('a'));
        System.out.println("contains   = " + "Java".contains("av"));
        System.out.println("replace    = " + "Java".replace('a', 'o'));
        System.out.println("upper      = " + "java".toUpperCase());
    }

    /**
     * Dry run email = raju.pandey@gmail.com
     *   at = index of '@' = 11
     *   username = substring(0, 11) = raju.pandey
     *   domain   = substring(12)    = gmail.com
     *   endsWith("@gmail.com")? use domain.equals("gmail.com")
     */
    private static void emailPartsProblem() {
        System.out.println("\n=== 2. PROBLEM: email parts ===");

        String email = "raju.pandey@gmail.com";
        int at = email.indexOf('@');

        String username = email.substring(0, at);
        String domain = email.substring(at + 1);

        System.out.println("Username = " + username);
        System.out.println("Domain   = " + domain);
        System.out.println("Is Gmail = " + domain.equals("gmail.com"));
    }
}
