package day9;

import java.util.Scanner;

public class ReverseAnArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;
        while (start < end) {

            // swapping the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // preparation for next iteration
            start++;
            end--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
