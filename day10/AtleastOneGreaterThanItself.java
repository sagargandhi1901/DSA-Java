package day10;

import java.util.Scanner;

public class AtleastOneGreaterThanItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = countNumberOfElementsGreaterThanItself(arr, n);
        System.out.println(count);
    }

    public static int countNumberOfElementsGreaterThanItself(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < max) {
                count++;
            }
        }
        return count;
    }
}
