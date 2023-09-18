package day18;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findPeakElement(arr);
        System.out.println(result);
    }

    public static int findPeakElement(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int left = 1;
        int right = arr.length - 2;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] > arr[middle - 1] && arr[middle] > arr[middle + 1]) {
                return middle;
            }
            if (arr[middle] < arr[middle - 1]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
