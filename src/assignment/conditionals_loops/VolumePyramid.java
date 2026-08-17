package assignment.conditionals_loops;

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base length of the pyramid :");
        double pyramidLength = input.nextDouble();
        System.out.println("Enter the Base width of the pyramid :");
        double pyramidWidth = input.nextDouble();
        System.out.println("Enter the Pyramid height of the pyramid :");
        double pyramidHeight = input.nextDouble();
        double result = volumeOfPyramid(pyramidLength, pyramidWidth, pyramidHeight);
        System.out.println("The volume of the pyramid is " + result);
    }

    static double volumeOfPyramid(double pyramidLength, double pyramidWidth, double pyramidHeight) {
        return (pyramidLength * pyramidWidth * pyramidHeight)/3;
    }
}
