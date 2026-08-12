package oop;

/**
 * this and super — common OOP interview keywords.
 *
 * this:
 *   - current object
 *   - this.field = parameter (name clash)
 *   - this() call another constructor in SAME class
 *
 * super:
 *   - parent constructor: super(...)
 *   - parent method/field: super.method()
 *
 * RULE:
 *   this(...) or super(...) must be the FIRST statement in a constructor.
 *
 * Dry run:
 *   new Car("Tata", 2024)
 *     → Car(String,int)
 *     → super("Tata") creates Vehicle part
 *     → year = 2024
 */
public class ThisAndSuper {

    public static void main(String[] args) {
        Car c1 = new Car("Tata");
        c1.show();

        System.out.println();

        Car c2 = new Car("Honda", 2024);
        c2.show();
        c2.describe();
    }
}

class VehicleBase {
    private final String brand;

    VehicleBase(String brand) {
        this.brand = brand; // this.field = param
        System.out.println("Vehicle created: " + brand);
    }

    String getBrand() {
        return brand;
    }

    void describe() {
        System.out.println("Brand from parent: " + brand);
    }
}

class Car extends VehicleBase {
    private final int year;

    // one-arg constructor
    Car(String brand) {
        this(brand, 0); // calls same-class constructor
    }

    // main constructor
    Car(String brand, int year) {
        super(brand); // parent constructor first
        this.year = year;
    }

    void show() {
        System.out.println("Car: " + getBrand() + ", year=" + year);
    }

    @Override
    void describe() {
        super.describe(); // parent version
        System.out.println("Year from child: " + year);
    }
}
