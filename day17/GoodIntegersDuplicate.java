package day17;

import java.util.Arrays;
import java.util.Scanner;

public class GoodIntegersDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countGoodIntegers(arr, n);
        System.out.println(result);
    }

    public static int countGoodIntegers(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;
        int lessCount = 0;

        if (arr[0] == 0) {
            count++;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                lessCount = i;
            }
            if (arr[i] == lessCount) {
                count++;
            }
        }
        return count;
    }
}
