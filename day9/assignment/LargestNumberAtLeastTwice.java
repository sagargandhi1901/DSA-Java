package day9.assignment;

import java.util.Scanner;

public class LargestNumberAtLeastTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (max < arr[i] * 2) {
                flag = false;
                break;
            }
        }

        if (flag) {
            printIndexOfMax(arr, max);
        } else {
            System.out.println(-1);
        }
    }

    public static void printIndexOfMax(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
        }
    }
}
