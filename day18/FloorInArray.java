package day18;

import java.util.Scanner;

public class FloorInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int result = findFloor(arr, target);
        System.out.println(result);
    }

    public static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MIN_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return target;
            } else if (arr[mid] < target) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
