package day16;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isArraySorted(arr, 0);
        System.out.println(result);
    }

    public static boolean isArraySorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        boolean temp = isArraySorted(arr, index + 1);
        if (temp == false) {
            return false;
        } else {
            return arr[index] <= arr[index + 1];
        }
    }
}
