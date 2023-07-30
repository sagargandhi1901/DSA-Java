package day7;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        // nCr -> n! / (r! * (n - r)!)
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(ncr);

        // nPr -> n! / (n - r)!
        int npr = factorial(n) / factorial(n - r);
        System.out.println(npr);
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
