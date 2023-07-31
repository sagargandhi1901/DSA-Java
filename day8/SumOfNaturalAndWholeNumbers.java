package day8;

import java.util.Scanner;

public class SumOfNaturalAndWholeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers : " + calculateNaturalNumbersSum(n));
        System.out.println("Sum of first " + n + " whole numbers : " + calculateWholeNumbersSum(n));
    }

    public static int calculateNaturalNumbersSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int calculateWholeNumbersSum(int n) {
        return (n * (n - 1)) / 2;
    }
}
