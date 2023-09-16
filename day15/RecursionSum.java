package day15;

import java.util.Scanner;

public class RecursionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = findSum(n);
        System.out.println(result);
    }

    public static int findSum(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = findSum(n - 1);
        return temp + n;
    }
}