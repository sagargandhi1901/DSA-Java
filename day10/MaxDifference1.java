package day10;

import java.util.Scanner;

public class MaxDifference1 {
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
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }

            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return maxNum - minNum;
    }

    /* O(n^2) approach
    public static int findMaxDiff(int[] arr, int n) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int pairDiff = arr[i] - arr[j];
                if (pairDiff > maxDiff) {
                    maxDiff = pairDiff;
                }
            }
        }
        return maxDiff;
    }*/
}
