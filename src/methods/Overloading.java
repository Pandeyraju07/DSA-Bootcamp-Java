package methods;

import java.util.Scanner;

/**
 * Method overloading — same method name, different parameter lists.
 *
 * Java picks which version to call by looking at:
 *   1. number of arguments
 *   2. type of arguments
 *   3. order of argument types
 *
 * Return type alone does NOT create overloading.
 *
 * Examples in this file:
 *   sum(int, int)
 *   sum(int, int, int)
 *   sum(double, double)
 *   area(int)           → square
 *   area(int, int)      → rectangle
 *   area(double)        → circle
 *
 * Practice problem at the bottom: Shape Area Calculator.
 */
public class Overloading {

    public static void main(String[] args) {
        overloadingDemo();
        typePromotionExample();
        shapeAreaProblem();
    }

    /**
     * Quick demo: same name "sum", different signatures.
     *
     * Dry run:
     *   sum(2, 3)       → matches sum(int, int)         → 5
     *   sum(2, 3, 4)    → matches sum(int, int, int)    → 9
     *   sum(2.5, 3.5)   → matches sum(double, double)   → 6.0
     */
    private static void overloadingDemo() {
        System.out.println("=== OVERLOADING DEMO ===");
        System.out.println("sum(2, 3)     = " + sum(2, 3));
        System.out.println("sum(2, 3, 4)  = " + sum(2, 3, 4));
        System.out.println("sum(2.5, 3.5) = " + sum(2.5, 3.5));
    }

    /**
     * Type promotion: if exact match is missing, Java may widen the type.
     *
     * byte/short/char can promote toward int → long → float → double
     *
     * Dry run:
     *   only show(int) exists
     *   show('A') → 'A' promoted to int (65) → show(int)
     *
     * Interview tip: promotion goes "up", not down (int will not auto-become byte).
     */
    private static void typePromotionExample() {
        System.out.println("\n=== TYPE PROMOTION ===");
        show(5);    // exact int
        show('A');  // char → promoted to int
    }

    private static void show(int n) {
        System.out.println("show(int): " + n);
    }

    // --- overloaded sum methods ---

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    // --- overloaded area methods ---

    /** Square: side * side */
    private static int area(int side) {
        return side * side;
    }

    /** Rectangle: length * breadth */
    private static int area(int length, int breadth) {
        return length * breadth;
    }

    /** Circle: π * r * r */
    private static double area(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * PRACTICE PROBLEM: Shape Area Calculator
     *
     * Input:
     *   choice → 1 = square, 2 = rectangle, 3 = circle
     *   then the needed measurements
     *
     * Output:
     *   area of that shape
     *
     * Why this shows overloading:
     *   all call area(...), but Java picks the right version
     *   based on how many / which types of values you pass.
     *
     * Sample run:
     *   Enter choice (1-square, 2-rectangle, 3-circle): 2
     *   Enter length: 5
     *   Enter breadth: 4
     *   Area = 20
     */
    private static void shapeAreaProblem() {
        System.out.println("\n=== PRACTICE: Shape Area Calculator ===");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter choice (1-square, 2-rectangle, 3-circle): ");
        int choice = in.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter side: ");
                int side = in.nextInt();
                System.out.println("Area = " + area(side));          // area(int)
            }
            case 2 -> {
                System.out.print("Enter length: ");
                int length = in.nextInt();
                System.out.print("Enter breadth: ");
                int breadth = in.nextInt();
                System.out.println("Area = " + area(length, breadth)); // area(int, int)
            }
            case 3 -> {
                System.out.print("Enter radius: ");
                double radius = in.nextDouble();
                System.out.println("Area = " + area(radius));        // area(double)
            }
            default -> System.out.println("Invalid choice");
        }
    }
}
