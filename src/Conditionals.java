public class Conditionals {

    public static void main(String[] args) {

        System.out.println("=== 1. SIMPLE IF STATEMENT ===");
        // Syntax: if (boolean expression) { body }
        int a = 10;
        if (a != 35) {
            System.out.println("Condition met: 'a' is not equal to 35");
        }


        System.out.println("\n=== 2. IF - ELSE STATEMENT ===");
        // Syntax: if (condition) { true branch } else { false branch }
        int salary = 8000;
        if (salary > 10000) {
            salary += 2000; // Bonus of 2000
        } else {
            salary += 1000; // Base bonus of 1000
        }
        System.out.println("Final Salary: " + salary);


        System.out.println("\n=== 3. IF - ELSE IF - ELSE LADDER (Correct Order) ===");
        /*
         * ALWAYS place the largest / most specific condition FIRST!
         */
        int employeeSalary = 25400;

        if (employeeSalary > 30000) {
            employeeSalary += 5000;
        } else if (employeeSalary > 20000) { //  Checked first & True!
            employeeSalary += 3000;
        } else if (employeeSalary > 10000) { // Skipped because previous matched
            employeeSalary += 2000;
        } else {
            employeeSalary += 1000;
        }
        System.out.println("Updated Employee Salary: " + employeeSalary);


        System.out.println("\n=== 4. TERNARY OPERATOR (Short-hand IF-ELSE) ===");
        // Syntax: variable = (condition) ? value_if_true : value_if_false;
        int age = 18;
        String status = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println("Voting Status: " + status);


        System.out.println("\n=== 5. COMBINING CONDITIONS (LOGICAL OPERATORS) ===");
        // AND (&&): Both conditions MUST be true
        // OR  (||): At least ONE condition MUST be true
        // NOT (! ): Inverts true to false & false to true
        int mark = 85;
        boolean isAttendanceGood = true;

        if (mark >= 80 && isAttendanceGood) {
            System.out.println("Grade: A+ with Distinction");
        } else if (mark >= 60 || isAttendanceGood) {
            System.out.println("Grade: Passed");
        } else {
            System.out.println("Grade: Needs Improvement");
        }


        System.out.println("\n=== 6. NESTED IF STATEMENT ===");
        // An 'if' statement inside another 'if' statement
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