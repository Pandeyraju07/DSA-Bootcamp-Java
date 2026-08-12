package oop;

/**
 * Classes & Objects — building blocks of OOP.
 *
 * Class  → blueprint / design (e.g. Student)
 * Object → real thing created from that blueprint (e.g. s1, s2)
 *
 * A class can have:
 *   fields     → data (name, rollNo)
 *   methods    → behavior (study, display)
 *   constructors → how to create the object
 *
 * PROBLEM:
 *   Create Student objects and print their details.
 *
 * Dry run:
 *   Student s1 = new Student("Raju", 101);
 *   → constructor sets name/rollNo in heap object
 *   → s1 in stack points to that heap object
 */
public class ClassesAndObjects {

    public static void main(String[] args) {
        Student s1 = new Student("Raju", 101);
        Student s2 = new Student("Ankit", 102);

        s1.display();
        s2.display();

        s1.study();
        System.out.println("Total students created = " + Student.studentCount);
    }
}

class Student {
    // fields (instance variables)
    String name;
    int rollNo;

    // static field → shared by all Student objects
    static int studentCount = 0;

    /**
     * Constructor: runs when we do new Student(...)
     */
    Student(String name, int rollNo) {
        this.name = name;     // this.name = field, name = parameter
        this.rollNo = rollNo;
        studentCount++;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNo);
    }

    void study() {
        System.out.println(name + " is studying Java OOP");
    }
}
