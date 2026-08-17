package assignment.conditionals_loops;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = in.nextDouble();
        double result = circumference(radius);
        System.out.println("The area of the circle is " + result);
    }
    public static double circumference(double radius) {
        return radius * radius;
    }

}
