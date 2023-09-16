package day10;

import java.util.Scanner;

public class MaxDifference4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxDiff(arr, n));
    }

    // O(n) approach
    public static int findMaxDiff(int[] arr, int n) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                a = i;
            }

            if (arr[i] < minNum) {
                minNum = arr[i];
                b = i;
            }
        }
        return Math.abs(maxNum - minNum) + Math.abs(a - b);
    }

    /* O(n^2) approach
    public static int findMaxDiff(int[] arr, int n) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int pairDiff = Math.abs(arr[i] - arr[j]) + i - j;
                if (pairDiff > maxDiff) {
                    maxDiff = pairDiff;
                }
            }
        }
        return maxDiff;
    }*/
}
