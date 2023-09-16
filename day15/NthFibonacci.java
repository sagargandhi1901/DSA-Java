package day15;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = findNthFibonacci(n);
        System.out.println(result);
    }

    public static int findNthFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int temp1 = findNthFibonacci(n - 1);
        int temp2 = findNthFibonacci(n - 2);

        return temp1 + temp2;
    }
}