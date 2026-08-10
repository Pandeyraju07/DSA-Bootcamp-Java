package conditions_loops;

/**
 * Easy reference for if / else / ternary / logical operators / nested if.
 * Run this class and read the output next to each example.
 */
public class Conditionals {

    public static void main(String[] args) {
        simpleIfExample();
        ifElseExample();
        ifElseIfLadderExample();
        ternaryExample();
        logicalOperatorsExample();
        nestedIfExample();
    }

    /**
     * if (condition) { body }
     *
     * Body runs only when condition is true.
     * If false → skip the whole block.
     */
    private static void simpleIfExample() {
        System.out.println("=== 1. SIMPLE IF ===");

        int a = 10;
        if (a != 35) {
            System.out.println("Condition met: a is not 35");
        }
        // a != 35 → true → print message
    }

    /**
     * if (condition) { true branch } else { false branch }
     *
     * Exactly one branch runs.
     */
    private static void ifElseExample() {
        System.out.println("\n=== 2. IF - ELSE ===");

        int salary = 8000;
        if (salary > 10000) {
            salary += 2000; // bonus when salary is high
        } else {
            salary += 1000; // smaller bonus otherwise
        }
        // 8000 > 10000 → false → else runs → salary = 9000
        System.out.println("Final Salary: " + salary);
    }

    /**
     * if / else if / else ladder
     *
     * Checks top to bottom.
     * First true condition wins; the rest are skipped.
     *
     * Tip: put larger / more specific checks first,
     * otherwise a smaller check can "catch" values too early.
     *
     * Dry run (employeeSalary = 25400):
     *   > 30000 ? false
     *   > 20000 ? true  → add 3000 → stop
     *   later branches never run
     */
    private static void ifElseIfLadderExample() {
        System.out.println("\n=== 3. IF - ELSE IF - ELSE LADDER ===");

        int employeeSalary = 25400;

        if (employeeSalary > 30000) {
            employeeSalary += 5000;
        } else if (employeeSalary > 20000) {
            employeeSalary += 3000;
        } else if (employeeSalary > 10000) {
            employeeSalary += 2000;
        } else {
            employeeSalary += 1000;
        }

        System.out.println("Updated Employee Salary: " + employeeSalary);
    }

    /**
     * Ternary: short if-else that returns a value
     *
     * Syntax: result = (condition) ? valueIfTrue : valueIfFalse;
     */
    private static void ternaryExample() {
        System.out.println("\n=== 4. TERNARY OPERATOR ===");

        int age = 18;
        String status = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";
        // age >= 18 → true → "Eligible to Vote"
        System.out.println("Voting Status: " + status);
    }

    /**
     * Logical operators:
     *   &&  AND → both sides must be true
     *   ||  OR  → at least one side true
     *   !   NOT → flips true/false
     */
    private static void logicalOperatorsExample() {
        System.out.println("\n=== 5. LOGICAL OPERATORS ===");

        int mark = 85;
        boolean isAttendanceGood = true;

        if (mark >= 80 && isAttendanceGood) {
            System.out.println("Grade: A+ with Distinction");
        } else if (mark >= 60 || isAttendanceGood) {
            System.out.println("Grade: Passed");
        } else {
            System.out.println("Grade: Needs Improvement");
        }
        // 85 >= 80 && true → true → first branch
    }

    /**
     * Nested if: an if inside another if.
     *
     * Outer check first; inner check only if outer is true.
     *
     * Dry run:
     *   hasCard = true, pin = 1234
     *   outer true → check pin → match → Access Granted
     */
    private static void nestedIfExample() {
        System.out.println("\n=== 6. NESTED IF ===");

        boolean hasCard = true;
        int pin = 1234;

        if (hasCard) {
            if (pin == 1234) {
                System.out.println("Access Granted: Transaction Successful!");
            } else {
                System.out.println("Access Denied: Incorrect PIN!");
            }
        } else {
            System.out.println("Please insert your ATM Card.");
        }
    }
}
