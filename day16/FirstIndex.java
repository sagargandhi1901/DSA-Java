package day16;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int result = findFirstIndex(arr, 0, target);
        System.out.println(result);
    }

    public static int findFirstIndex(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        int temp = findFirstIndex(arr, index + 1, target);
        if (arr[index] == target) {
            return index;
        } else {
            return temp;
        }
    }
}
