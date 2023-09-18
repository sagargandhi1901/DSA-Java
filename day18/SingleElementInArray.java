package day18;

import java.util.Scanner;

public class SingleElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findElementInArray(arr, n);
        System.out.println(result);
    }

    public static int findElementInArray(int[] arr, int n) {
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        int start = 2;
        int end = n - 3;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] == arr[mid - 1]) {
                mid--;
            }
            if (mid % 2 == 0) {
                start = mid + 2;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
