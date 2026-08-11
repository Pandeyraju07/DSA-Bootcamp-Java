package methods;

import java.util.Arrays;

/**
 * Variable-length arguments (varargs) — method(...).
 *
 * Syntax:
 *   returnType name(Type... args)
 *
 * Inside the method, args is just an array.
 * Caller can pass 0, 1, or many values.
 *
 * Rules:
 *   1. Only ONE varargs parameter allowed
 *   2. It must be the LAST parameter
 *
 * Related: overloading with varargs (Java may get ambiguous — see below)
 */
public class VarArgs {

    public static void main(String[] args) {
        basicVarArgs();
        varArgsWithOtherParams();
        ambiguityDemoNote();
    }

    /**
     * Dry run:
     *   sum()          → 0 numbers → 0
     *   sum(2, 3)      → 5
     *   sum(1, 2, 3, 4)→ 10
     */
    private static void basicVarArgs() {
        System.out.println("=== 1. BASIC VARARGS ===");
        System.out.println("sum()           = " + sum());
        System.out.println("sum(2, 3)       = " + sum(2, 3));
        System.out.println("sum(1, 2, 3, 4) = " + sum(1, 2, 3, 4));
    }

    private static int sum(int... nums) {
        System.out.println("Received: " + Arrays.toString(nums));
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    /**
     * Normal parameters first, varargs last.
     *
     * greet("Raju", "Hi", "Hello") 
     *   name = "Raju"
     *   messages = ["Hi", "Hello"]
     */
    private static void varArgsWithOtherParams() {
        System.out.println("\n=== 2. VARARGS MUST BE LAST ===");
        greet("Raju", "Hi", "Welcome");
    }

    private static void greet(String name, String... messages) {
        System.out.println("Name: " + name);
        System.out.println("Messages: " + Arrays.toString(messages));
    }

    /**
     * Interview note: overloading + varargs can be ambiguous.
     *
     * Example that would NOT compile if both existed and you call fun():
     *   void fun(int... a)
     *   void fun(String... a)
     *   fun();  // ambiguous — which one?
     *
     * So when overloading with varargs, keep signatures clearly different.
     */
    private static void ambiguityDemoNote() {
        System.out.println("\n=== 3. AMBIGUITY NOTE ===");
        System.out.println("Calling fun(1, 2) uses int... version");
        fun(1, 2);
        System.out.println("Calling fun(\"a\", \"b\") uses String... version");
        fun("a", "b");
        // fun(); // would be ambiguous if both match empty call — avoid that design
    }

    private static void fun(int... a) {
        System.out.println("int varargs: " + Arrays.toString(a));
    }

    private static void fun(String... a) {
        System.out.println("String varargs: " + Arrays.toString(a));
    }
}
