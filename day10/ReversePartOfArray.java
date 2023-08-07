package day10;

import java.util.Scanner;

public class ReversePartOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        int e = sc.nextInt();

        int[] ans = reversePartOfArray(arr, s, e);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] reversePartOfArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
