package day17;

import java.util.Arrays;
import java.util.Scanner;

public class OrderOfRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = orderOfRemoval(arr, n);
        System.out.println(result);
    }

    public static int orderOfRemoval(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int temp = arr[i] * (n - i);
            ans = ans + temp;
        }
        return ans;
    }
}
