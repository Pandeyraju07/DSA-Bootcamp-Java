package conditions_loops;

import java.util.Scanner;

/**
 * Easy reference for switch + a small practice problem.
 *
 * Use switch when you compare ONE value against many fixed options
 * (cleaner than a long if-else if ladder).
 *
 * Syntax (classic):
 *   switch (value) {
 *       case A:
 *           // work
 *           break;          // leave the switch (important!)
 *       case B:
 *           // work
 *           break;
 *       default:
 *           // if nothing matched
 *   }
 *
 * Remember:
 *   - case must be a constant (literal / final)
 *   - without break → fall-through (next case also runs)
 *   - default runs when no case matches
 */
public class SwitchSyntax {

    public static void main(String[] args) {
        basicSwitchExample();
        fallThroughExample();
        defaultExample();

        // Practice problem (interactive)
        dayOfWeekProblem();
        nestedSwitchProblem();
    }

    /**
     * Basic switch: match day number → day name.
     *
     * Dry run (day = 3):
     *   compare 3 with case 1 → no
     *   case 2 → no
     *   case 3 → yes → print "Wednesday" → break → done
     */
    private static void basicSwitchExample() {
        System.out.println("=== 1. BASIC SWITCH ===");

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }

    /**
     * Fall-through: if you forget break, the next cases keep running.
     *
     * Useful on purpose for grouping (e.g. weekend days).
     *
     * Dry run (day = 6):
     *   case 6 matches → no break → also runs case 7 → then break
     *   → prints "Weekend"
     */
    private static void fallThroughExample() {
        System.out.println("\n=== 2. FALL-THROUGH (group cases) ===");

        int day = 6;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }

    /**
     * default: safety net when nothing matches.
     */
    private static void defaultExample() {
        System.out.println("\n=== 3. DEFAULT CASE ===");

        char grade = 'Z';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Grade not recognized");
        }
        // grade 'Z' matches nothing → default
    }

    /**
     * PRACTICE PROBLEM 1
     * Input: day number (1–7)
     * Output: day name
     *
     * Example:
     *   Enter day number (1-7): 5
     *   Friday
     */
    private static void dayOfWeekProblem() {
        System.out.println("\n=== PRACTICE 1: Day of week ===");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number");
        }
        // Note: case X -> ... is the newer Java switch form (no break needed)
    }

    /**
     * PRACTICE PROBLEM 2 — Nested switch
     * Outer switch: employee id
     * Inner switch: department
     *
     * Dry run:
     *   empID = 2, department = "IT"
     *   outer matches case 2 → inner matches "IT" → print message
     */
    private static void nestedSwitchProblem() {
        System.out.println("\n=== PRACTICE 2: Nested switch ===");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter employee id (1 or 2): ");
        int empID = in.nextInt();

        System.out.print("Enter department (IT / Management): ");
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Employee: Raju");
                break;
            case 2:
                System.out.println("Employee: Kunal");
                switch (department) {
                    case "IT":
                        System.out.println("Department: IT");
                        break;
                    case "Management":
                        System.out.println("Department: Management");
                        break;
                    default:
                        System.out.println("Unknown department");
                }
                break;
            default:
                System.out.println("Unknown employee id");
        }
    }
}
