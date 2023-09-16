package day15;

import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = findFactorial(n);
        System.out.println(result);
    }

    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = findFactorial(n - 1);
        return temp * n;
    }
}
