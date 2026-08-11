package methods;

/**
 * Method overriding — child class redefines a parent method.
 *
 * Rules (quick revision):
 *   1. Same method name + same parameters (signature)
 *   2. Inheritance is required (extends)
 *   3. Return type: same, or covariant (child type)
 *   4. Access: cannot be weaker (e.g. public → private is wrong)
 *   5. static / private / final methods cannot be overridden
 *
 * Overloading vs Overriding:
 *   Overloading → same class, different parameters, compile-time
 *   Overriding  → parent/child, same signature, runtime
 *
 * Interview focus in this file:
 *   Parent reference → Child object  (runtime polymorphism)
 */
public class Overriding {

    public static void main(String[] args) {
        basicOverrideExample();
        superKeywordExample();
        runtimePolymorphismInterviewExample();
        bankInterestInterviewExample();
        staticHidingNote();
    }

    /**
     * Basic overriding: Dog replaces Animal's sound().
     *
     * Dry run:
     *   Dog d = new Dog();
     *   d.sound();  → Dog's version runs → "Bark"
     */
    private static void basicOverrideExample() {
        System.out.println("=== 1. BASIC OVERRIDING ===");

        Dog dog = new Dog();
        dog.sound(); // Child method runs
        dog.eat();   // Inherited from Animal (not overridden)
    }

    /**
     * super.method() — call the PARENT version from the child.
     *
     * Dry run:
     *   dog.soundWithParent()
     *     → first Animal's sound via super.sound()
     *     → then Dog's own message
     */
    private static void superKeywordExample() {
        System.out.println("\n=== 1b. super KEYWORD ===");

        Dog dog = new Dog();
        dog.soundWithParent();
    }

    /**
     * Interview note: static methods are HIDDEN, not overridden.
     * Call depends on REFERENCE type, not object type.
     */
    private static void staticHidingNote() {
        System.out.println("\n=== 4. STATIC = HIDING (not overriding) ===");

        Animal a = new Dog();
        a.info(); // Animal.info() — reference type wins for static
        Dog.info(); // Dog.info()
    }

    /**
     * INTERVIEW FAVORITE: Runtime polymorphism
     *
     *   Animal a = new Dog();
     *   a.sound();
     *
     * Key point interviewers want:
     *   - Reference type  → Animal (decides what you CAN call)
     *   - Object type     → Dog    (decides which version RUNS for overridden methods)
     *
     * So a.sound() calls Dog.sound(), not Animal.sound().
     * Decision happens at RUNTIME → dynamic method dispatch.
     *
     * Dry run:
     *   a points to a Dog object in memory
     *   sound() is overridden in Dog
     *   JVM runs Dog's sound() → "Bark"
     */
    private static void runtimePolymorphismInterviewExample() {
        System.out.println("\n=== 2. INTERVIEW: Parent ref + Child object ===");

        Animal a = new Dog(); // parent reference, child object
        a.sound();            // Dog's sound() runs (overridden)

        // a.wagTail(); // NOT allowed — wagTail() is only in Dog,
        // and reference type Animal does not know it.

        Animal plain = new Animal();
        plain.sound(); // Animal's sound() runs
    }

    /**
     * INTERVIEW CLASSIC: Bank interest rate
     *
     * Same method name getRateOfInterest() in parent + children.
     * Different banks return different rates via overriding.
     *
     * Dry run:
     *   Bank b1 = new SBI();
     *   Bank b2 = new HDFC();
     *   b1.getRateOfInterest() → 8.2  (SBI version)
     *   b2.getRateOfInterest() → 9.0  (HDFC version)
     *
     * Why interviewers like this:
     *   Same parent type (Bank), different child behavior at runtime.
     */
    private static void bankInterestInterviewExample() {
        System.out.println("\n=== 3. INTERVIEW: Bank interest (overriding) ===");

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new Bank(); // parent default

        System.out.println("SBI rate  = " + b1.getRateOfInterest() + "%");
        System.out.println("HDFC rate = " + b2.getRateOfInterest() + "%");
        System.out.println("Bank rate = " + b3.getRateOfInterest() + "%");
    }
}

/**
 * Parent class
 */
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal eats food");
    }

    static void info() {
        System.out.println("Animal static info");
    }
}

/**
 * Child class — overrides sound()
 */
class Dog extends Animal {

    @Override // good practice: compiler checks you really overrode something
    void sound() {
        System.out.println("Bark");
    }

    void soundWithParent() {
        super.sound(); // parent version
        System.out.println("Bark (child extra)");
    }

    void wagTail() {
        System.out.println("Dog wags tail");
    }

    static void info() { // hides Animal.info(), does NOT override it
        System.out.println("Dog static info");
    }
}

/**
 * Parent bank — default interest
 */
class Bank {
    double getRateOfInterest() {
        return 5.0;
    }
}

/**
 * Child bank — overrides interest rate
 */
class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.2;
    }
}

/**
 * Child bank — overrides interest rate
 */
class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.0;
    }
}
