package day8;

import java.util.Scanner;

public class FloorAndCeilForSqrtOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("floor(sqrt(" + n + ")) : " + calculateFloor(n));
        System.out.println("ceil(sqrt(" + n + ")) : " + calculateCeil(n));
    }

    public static int calculateFloor(int n) {
        int ans = 1;

        for (int i = 1; i * i <= n; i++) {
            ans = i;
        }
        return ans;
    }

    public static int calculateCeil(int n) {
        return (calculateFloor(n) + 1);
    }
}
