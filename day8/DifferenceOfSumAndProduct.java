package day8;

import java.util.Scanner;

public class DifferenceOfSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Difference of product and sum of " + n + " : " + calculateDifference(n));
    }

    public static int calculateDifference(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        return product - sum;
    }
}
