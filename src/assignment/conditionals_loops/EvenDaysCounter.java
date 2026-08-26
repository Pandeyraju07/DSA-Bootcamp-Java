package assignment.conditionals_loops;

import java.util.Scanner;

public class EvenDaysCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days in the month: ");
        int daysInMonth = sc.nextInt();

        int result = countEvenDays(daysInMonth);

        System.out.println("Kunal can go out for " + result + " days.");
    }

    public static int countEvenDays(int daysInMonth) {
        int count = 0;
        for (int day = 1; day <= daysInMonth; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
