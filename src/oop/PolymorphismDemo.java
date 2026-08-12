package oop;

/**
 * Polymorphism — one name, many forms.
 *
 * 1) Compile-time polymorphism = Method Overloading
 *    same method name, different parameters
 *    decided at compile time
 *
 * 2) Runtime polymorphism = Method Overriding
 *    parent ref → child object
 *    decided at runtime (dynamic dispatch)
 *
 * INTERVIEW FAVORITE:
 *   Shape s = new Circle();
 *   s.area();  → Circle's area runs
 *
 * Dry run:
 *   shapes = [Circle(r=2), Rectangle(3,4)]
 *   for each shape → call area()
 *   → Circle formula, then Rectangle formula
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        compileTimeDemo();
        runtimeDemo();
    }

    /**
     * Overloading: Calculator-like add methods.
     */
    private static void compileTimeDemo() {
        System.out.println("=== 1. COMPILE-TIME (Overloading) ===");
        System.out.println("add(2, 3)     = " + add(2, 3));
        System.out.println("add(2, 3, 4)  = " + add(2, 3, 4));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    /**
     * Overriding + parent references.
     */
    private static void runtimeDemo() {
        System.out.println("\n=== 2. RUNTIME (Overriding) ===");

        Shape[] shapes = {
                new Circle(2),
                new Rectangle(3, 4),
                new Circle(1.5)
        };

        for (Shape s : shapes) {
            // same call: s.area() — different implementations run
            System.out.println(s.getClass().getSimpleName() + " area = " + s.area());
        }
    }
}

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}
