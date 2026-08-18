package assignment.conditionals_loops;

import java.util.Scanner;

public class ProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();

        int result =  subtractProductAndSum(n);
        System.out.println(result);

    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum - product;
    }
}

