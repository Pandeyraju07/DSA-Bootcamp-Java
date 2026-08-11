package methods;

/**
 * static vs instance (non-static) methods / variables.
 *
 * static:
 *   belongs to the CLASS
 *   call with ClassName.method() (or from another static method)
 *   no object needed
 *   cannot use instance fields directly (no "this" object)
 *
 * instance:
 *   belongs to an OBJECT
 *   call with object.method()
 *   can use instance fields
 *
 * main is static → that is why beginners start with static helpers.
 */
public class StaticVsInstance {

    static int staticCount = 0; // shared by all objects
    int id;                     // each object has its own

    public StaticVsInstance(int id) {
        this.id = id;
        staticCount++;
    }

    public static void main(String[] args) {
        staticCallDemo();
        instanceCallDemo();
        sharedStaticDemo();
    }

    /**
     * Call static method without creating an object.
     */
    private static void staticCallDemo() {
        System.out.println("=== 1. STATIC METHOD ===");
        StaticVsInstance.sayHello(); // ClassName.method()
        sayHello();                  // also ok from same class
    }

    private static void sayHello() {
        System.out.println("Hello from static method");
        // System.out.println(id); // ERROR: cannot use instance field here
    }

    /**
     * Instance method needs an object.
     *
     * Dry run:
     *   obj.id = 7
     *   obj.showId() → prints 7
     */
    private static void instanceCallDemo() {
        System.out.println("\n=== 2. INSTANCE METHOD ===");

        StaticVsInstance obj = new StaticVsInstance(7);
        obj.showId(); // needs object
    }

    void showId() {
        System.out.println("Object id = " + id);
        System.out.println("Also can read staticCount = " + staticCount);
    }

    /**
     * static field is SHARED.
     *
     * Dry run:
     *   create obj1 → staticCount=1
     *   create obj2 → staticCount=2
     *   both objects see staticCount as 2
     */
    private static void sharedStaticDemo() {
        System.out.println("\n=== 3. STATIC FIELD IS SHARED ===");

        staticCount = 0; // reset for clear demo
        StaticVsInstance a = new StaticVsInstance(1);
        StaticVsInstance b = new StaticVsInstance(2);

        System.out.println("a.id=" + a.id + ", b.id=" + b.id);
        System.out.println("staticCount (shared) = " + StaticVsInstance.staticCount);
    }
}
