package oop;

/**
 * Access modifiers — often asked with Encapsulation/Inheritance.
 *
 * private   → same class only
 * default   → same package (no modifier)
 * protected → same package + child classes (even other package)
 * public    → everywhere
 *
 * PROBLEM / DEMO:
 *   Show what is accessible from another class in same package.
 */
public class AccessModifiersDemo {

    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        // System.out.println(obj.secret); // ERROR: private
        System.out.println("defaultField = " + obj.defaultField);
        System.out.println("protectedField = " + obj.protectedField);
        System.out.println("publicField = " + obj.publicField);

        obj.showSecretViaMethod(); // allowed: public method reads private data
    }
}

class AccessExample {
    private String secret = "hidden";
    String defaultField = "package-visible";
    protected String protectedField = "child-visible";
    public String publicField = "everyone";

    public void showSecretViaMethod() {
        System.out.println("secret via method = " + secret);
    }
}
