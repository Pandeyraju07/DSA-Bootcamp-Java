package oop;

/**
 * Abstraction — show WHAT, hide HOW.
 *
 * Two ways in Java:
 *   1) abstract class
 *      - can have abstract + concrete methods
 *      - can have fields / constructors
 *      - a class extends only ONE abstract class
 *
 *   2) interface
 *      - 100% abstraction traditionally (Java 8+ can have default/static)
 *      - class can implement MANY interfaces
 *
 * Interview difference (short):
 *   abstract class → "is-a" with shared code
 *   interface      → "can-do" capability / contract
 *
 * PROBLEM:
 *   Animal abstract class (shared sleep)
 *   + Flyable interface (capability)
 *   Bird implements both ideas.
 */
public class AbstractionDemo {

    public static void main(String[] args) {
        Animal dog = new DogAnimal("Bruno");
        Animal bird = new Bird("Mithu");

        dog.makeSound(); // abstract implemented by child
        dog.sleep();     // concrete from parent

        System.out.println();

        bird.makeSound();
        bird.sleep();

        if (bird instanceof Flyable f) {
            f.fly(); // interface capability
        }

        // payment contract example
        System.out.println();
        Payable payment = new UpiPayment();
        payment.pay(250);
    }
}

/**
 * Abstract class: incomplete class — cannot do new Animal(...)
 */
abstract class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    // abstract → child MUST implement
    abstract void makeSound();

    // concrete → shared implementation
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class DogAnimal extends Animal {
    DogAnimal(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

class Bird extends Animal implements Flyable {
    Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " chirps");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}

/**
 * Interface = contract of capabilities
 */
interface Flyable {
    void fly();
}

interface Payable {
    void pay(double amount);
}

class UpiPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
