package oop;

/**
 * INTERVIEW COMBO: all 4 pillars in one mini system.
 *
 * Scenario: Company payment processing
 *
 * Encapsulation → private salary / amount fields
 * Inheritance   → FullTimeEmployee / Intern extend EmployeeBase
 * Polymorphism  → EmployeeBase ref calls calculatePay() differently
 * Abstraction   → abstract EmployeeBase + Taxable interface
 *
 * Dry run:
 *   employees = [FullTime(60000), Intern(15000)]
 *   for each:
 *     pay = calculatePay()
 *     tax = taxAmount(pay)
 *     print net
 */
public class InterviewOOP {

    public static void main(String[] args) {
        EmployeeBase[] employees = {
                new FullTimeEmployee("Raju", 60000),
                new InternEmployee("Neha", 15000)
        };

        for (EmployeeBase e : employees) {
            double pay = e.calculatePay();
            double tax = e.taxAmount(pay);
            System.out.println(e.getName()
                    + " | pay=" + pay
                    + " | tax=" + tax
                    + " | net=" + (pay - tax));
        }
    }
}

interface Taxable {
    double taxAmount(double pay);
}

abstract class EmployeeBase implements Taxable {
    private final String name; // encapsulated

    EmployeeBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // different employees implement differently (polymorphism)
    abstract double calculatePay();
}

class FullTimeEmployee extends EmployeeBase {
    private final double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return monthlySalary; // full salary
    }

    @Override
    public double taxAmount(double pay) {
        return pay * 0.10; // 10% tax
    }
}

class InternEmployee extends EmployeeBase {
    private final double stipend;

    InternEmployee(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    double calculatePay() {
        return stipend; // stipend only
    }

    @Override
    public double taxAmount(double pay) {
        return 0; // no tax for intern in this example
    }
}
