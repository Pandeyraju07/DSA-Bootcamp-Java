package assignment.conditionals_loops;

import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int unitsConsumed = input.nextInt();

        double bill = calculateElectricityBill(unitsConsumed);

        System.out.println("Electricity Bill: ₹" + bill);

        input.close();
    }

    public static double calculateElectricityBill(int unitsConsumed) {

        double bill;

        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
        } else if (unitsConsumed <= 200) {
            bill = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else if (unitsConsumed <= 300) {
            bill = (100 * 5)
                    + (100 * 7)
                    + ((unitsConsumed - 200) * 10);
        } else {
            bill = (100 * 5)
                    + (100 * 7)
                    + (100 * 10)
                    + ((unitsConsumed - 300) * 12);
        }

        return bill;
    }
}