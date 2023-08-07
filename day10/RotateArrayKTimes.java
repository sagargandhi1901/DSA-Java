package day10;

import java.util.Scanner;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rotateArray(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            k = k % n;
        }
        reverseArrayElements(arr, 0, n - 1);
        reverseArrayElements(arr, 0, k - 1);
        reverseArrayElements(arr, k, n - 1);
    }

    public static void reverseArrayElements(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
