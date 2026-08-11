package arrays;

/**
 * Why arrays exist — store many values of the SAME type under one name.
 *
 * Without arrays:
 *   int rno1 = 23;
 *   int rno2 = 55;
 *   int rno3 = 18;
 *   ... becomes messy for 100 students
 *
 * With arrays:
 *   int[] rnos = new int[5];   // 5 roll numbers in one variable
 *
 * Syntax:
 *   datatype[] variableName = new datatype[size];
 *
 * Memory idea:
 *   declaration  → reference lives in STACK
 *   new ...[n]   → actual array object lives in HEAP
 *   variable holds the address (reference) of that heap object
 *
 * Indexing:
 *   first element → index 0
 *   last element  → index (length - 1)
 */
public class ArrayBasics {

    public static void main(String[] args) {
        whyArrays();
        declarationAndInit();
        defaultValues();
        enhanceForLoop();
        averageMarksProblem();
    }

    /**
     * Problem: one variable stores one value.
     * Array: one variable stores many values (same type).
     */
    private static void whyArrays() {
        System.out.println("=== 1. WHY ARRAYS ===");

        // Q: store a roll number
        int a = 19;
        System.out.println("One roll number: " + a);

        // Q: store a person's name
        String name = "Kunal Kushwaha";
        System.out.println("One name: " + name);

        // Q: store a few roll numbers WITHOUT array (ugly as count grows)
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;
        System.out.println("Separate vars: " + rno1 + ", " + rno2 + ", " + rno3);
    }

    /**
     * Two-step creation vs direct creation.
     *
     * Dry run:
     *   int[] ros;          → ros in stack, points to nothing yet (null)
     *   ros = new int[5];   → heap creates [0, 0, 0, 0, 0], ros points to it
     *
     * Direct:
     *   int[] rnos2 = {23, 12, 45, 32, 15};
     *   → declare + create + fill in one line
     */
    private static void declarationAndInit() {
        System.out.println("\n=== 2. DECLARATION + INITIALISATION ===");

        int[] ros;          // declaration: reference in stack
        ros = new int[5];   // initialisation: object in heap (size 5)

        ros[0] = 23;
        ros[1] = 12;
        ros[2] = 45;
        ros[3] = 32;
        ros[4] = 15;

        System.out.println("ros[0] = " + ros[0]);
        System.out.println("ros length = " + ros.length);

        // or directly
        int[] rnos2 = {23, 12, 45, 32, 15};
        System.out.println("rnos2[2] = " + rnos2[2]); // 45
    }

    /**
     * New arrays get DEFAULT values:
     *   int / long / short / byte → 0
     *   double / float            → 0.0
     *   boolean                   → false
     *   objects / String          → null
     *
     * Dry run:
     *   String[] arr = new String[4];
     *   arr[0] → null  (no String object assigned yet)
     */
    private static void defaultValues() {
        System.out.println("\n=== 3. DEFAULT VALUES ===");

        int[] nums = new int[3];
        System.out.println("int default nums[0] = " + nums[0]); // 0

        String[] arr = new String[4];
        System.out.println("String default arr[0] = " + arr[0]); // null

        boolean[] flags = new boolean[2];
        System.out.println("boolean default flags[0] = " + flags[0]); // false
    }

    /**
     * Enhanced for-loop (for-each): read every element easily.
     *
     * Syntax: for (datatype element : array) { ... }
     *
     * Use when you need values, not indexes.
     * Use normal for when you need index (i).
     */
    private static void enhanceForLoop() {
        System.out.println("\n=== 4. FOR-EACH LOOP ===");

        String[] arr = {"Kunal", "Raju", "Ankit", "Neha"};

        for (String element : arr) {
            System.out.println(element);
        }
    }

    /**
     * PRACTICE PROBLEM (basics):
     *   Store marks of 5 subjects and print average.
     *
     * Dry run marks = [80, 70, 90, 60, 100]:
     *   sum = 400, average = 400/5 = 80.0
     */
    private static void averageMarksProblem() {
        System.out.println("\n=== 5. PROBLEM: average marks ===");

        int[] marks = {80, 70, 90, 60, 100};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.length;
        System.out.println("Average = " + average);
    }
}
