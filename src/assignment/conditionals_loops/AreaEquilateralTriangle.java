package assignment.conditionals_loops;

import java.util.Scanner;

public class AreaEquilateralTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the triangle: ");
        double side = sc.nextDouble();

        double area = areaOfEquilateralTriangle(side);

        System.out.println("Area of Equilateral Triangle = " + area);
    }

    static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }
}
