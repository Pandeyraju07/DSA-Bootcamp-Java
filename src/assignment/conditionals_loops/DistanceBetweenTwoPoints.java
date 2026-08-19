package assignment.conditionals_loops;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.println("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.println("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.println("Enter y2: ");
        int y2 = sc.nextInt();

        double distance = distanceBetweenTwoPoints(x1, y1, x2, y2);

        System.out.println("The distance between two points is " + distance);
    }

    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}