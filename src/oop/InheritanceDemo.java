package oop;

/**
 * Inheritance — child class reuses / extends parent class.
 *
 * Syntax: class Child extends Parent
 *
 * Child gets:
 *   parent's accessible fields + methods
 * and can:
 *   add new fields/methods
 *   override parent methods
 *
 * Keywords:
 *   super(...)  → call parent constructor
 *   super.method() → call parent method
 *
 * PROBLEM:
 *   Employee → Developer / Manager
 *   each has salary details + role-specific bonus.
 *
 * Dry run:
 *   Developer d = new Developer("Raju", 50000, "Java");
 *   d.display() uses parent fields + child skill
 *   d.bonus() → 10% of salary
 */
public class InheritanceDemo {

    public static void main(String[] args) {
        Developer d = new Developer("Raju", 50000, "Java");
        Manager m = new Manager("Ankit", 80000, 5);

        d.display();
        System.out.println("Developer bonus = " + d.bonus());

        System.out.println();

        m.display();
        System.out.println("Manager bonus = " + m.bonus());
    }
}

class Employee {
    protected String name;   // accessible in child
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    double bonus() {
        return salary * 0.05; // default 5%
    }
}

class Developer extends Employee {
    private String language;

    Developer(String name, double salary, String language) {
        super(name, salary); // must call parent constructor
        this.language = language;
    }

    @Override
    void display() {
        super.display(); // reuse parent print
        System.out.println("Language: " + language);
    }

    @Override
    double bonus() {
        return salary * 0.10; // developers get 10%
    }
}

class Manager extends Employee {
    private int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Team size: " + teamSize);
    }

    @Override
    double bonus() {
        return salary * 0.15; // managers get 15%
    }
}
