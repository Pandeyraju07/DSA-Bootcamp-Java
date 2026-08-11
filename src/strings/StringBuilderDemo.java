package strings;

/**
 * Concept: StringBuilder for heavy string modification.
 *
 * Why?
 *   String is immutable → s = s + "x" in a loop creates many objects (slow).
 *   StringBuilder is mutable → change in place (fast).
 *
 * Common methods:
 *   append, insert, delete, reverse, toString
 *
 * PROBLEM:
 *   Build a string of numbers 1..n using StringBuilder
 *   Example n=5 → "12345"
 *
 * Interview tip:
 *   Prefer StringBuilder when concatenating in loops.
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
        whyStringBuilder();
        buildNumbersProblem(5);
        reverseWordsProblem();
    }

    /**
     * Bad (many String objects) vs good (one builder).
     */
    private static void whyStringBuilder() {
        System.out.println("=== 1. STRING vs STRINGBUILDER ===");

        String s = "";
        s = s + "Hi";
        s = s + " Java"; // new String each time
        System.out.println("String concat: " + s);

        StringBuilder sb = new StringBuilder();
        sb.append("Hi");
        sb.append(" Java"); // same object mutated
        System.out.println("StringBuilder: " + sb);
    }

    /**
     * Dry run n=5:
     *   append 1 → "1"
     *   append 2 → "12"
     *   ...
     *   → "12345"
     */
    private static void buildNumbersProblem(int n) {
        System.out.println("\n=== 2. PROBLEM: build 1..n ===");

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }

    /**
     * PROBLEM: reverse each word in a sentence.
     * "hi java" → "ih avaj"
     *
     * Dry run word "java":
     *   new StringBuilder("java").reverse() → "avaj"
     */
    private static void reverseWordsProblem() {
        System.out.println("\n=== 3. PROBLEM: reverse each word ===");

        String sentence = "hi java";
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            ans.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) {
                ans.append(' ');
            }
        }

        System.out.println(ans);
    }
}
