package day16;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        long result = pow(a, n);
        System.out.println(result);
    }

    // O(N)
//    public static int pow(int a, int n) {
//        if (n == 1) {
//            return a;
//        }
//        int temp = pow(a, n -1);
//        return temp * a;
//    }

    // O(logN)
    public static long pow(int a, int n) {
        if (n == 1) {
            return a;
        }
        long temp = pow(a, n / 2);
        return (n % 2 == 0) ? temp * temp : temp * temp * a;
    }
}
