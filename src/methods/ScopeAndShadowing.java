package methods;

/**
 * Scope and shadowing — where a variable is visible.
 *
 * Scope:
 *   A variable lives only inside the block { } where it was declared.
 *
 * Shadowing:
 *   A local variable hides (shadows) another variable with the same name
 *   from an outer scope (often a class field).
 *
 * Note: you cannot shadow a local variable with another local in the
 * same method in an overlapping way that confuses the compiler —
 * inner block can declare a new name, but redeclaring same local in
 * overlapping scope is not allowed.
 */
public class ScopeAndShadowing {

    static int x = 100; // class-level (static) variable

    public static void main(String[] args) {
        scopeExample();
        shadowingExample();
        blockScopeExample();
    }

    /**
     * Scope: i exists only inside the for loop.
     * Using i after the loop would be a compile error.
     */
    private static void scopeExample() {
        System.out.println("=== 1. SCOPE ===");

        for (int i = 1; i <= 3; i++) {
            System.out.println("i inside loop = " + i);
        }
        // System.out.println(i); // ERROR: i out of scope here

        int num = 10;
        System.out.println("num in method = " + num);
        // num's scope = this whole method
    }

    /**
     * Shadowing: local x hides the class-level x.
     *
     * Dry run:
     *   class x = 100
     *   local x = 50   → prints 50 inside method
     *   after method, class x still 100
     *
     * Use ClassName.x (ScopeAndShadowing.x) to reach the shadowed one.
     */
    private static void shadowingExample() {
        System.out.println("\n=== 2. SHADOWING ===");

        System.out.println("Class x before = " + x); // 100

        int x = 50; // local x shadows class x
        System.out.println("Local x        = " + x); // 50
        System.out.println("Class x still  = " + ScopeAndShadowing.x); // 100
    }

    /**
     * Block scope: variable declared inside { } dies at closing }.
     */
    private static void blockScopeExample() {
        System.out.println("\n=== 3. BLOCK SCOPE ===");

        int a = 10;
        {
            int b = 20; // only inside this block
            System.out.println("a + b = " + (a + b));
        }
        // System.out.println(b); // ERROR: b out of scope
        System.out.println("a still alive = " + a);
    }
}
