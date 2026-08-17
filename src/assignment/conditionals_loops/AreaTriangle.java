package assignment.conditionals_loops;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Base of the triangle");
        double base = in.nextDouble();
        System.out.println("Enter the Height of the triangle");
        double height = in.nextDouble();

        double result = areaOfTriangle(base, height);
        System.out.println("The area of the Triangle is " + result);
    }

    public static double areaOfTriangle(double base, double height) {
        double area = (base * height)/2;
        return area;
    }
}
