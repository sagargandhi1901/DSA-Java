package day8;

import java.util.Scanner;

public class FloorAndCeilForSqrtOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("floor(sqrt(" + n + ")) : " + calculateFloorForSqrtOfN(n));
        System.out.println("ceil(sqrt(" + n + ")) : " + calculateCeilForSqrtOfN(n));
    }

    public static int calculateFloorForSqrtOfN(int n) {
        int ans = 1;
        for (int i = 1; i * i <= n; i++) {
            ans = i;
        }
        return ans;
    }

    public static int calculateCeilForSqrtOfN(int n) {
        int temp = calculateFloorForSqrtOfN(n);
        if (temp * temp == n) {
            return temp;
        }
        return (temp + 1);
    }
}
