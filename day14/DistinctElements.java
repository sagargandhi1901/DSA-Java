package day14;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findDistinctElements(arr, n));
    }

    public static int findDistinctElements(int[] arr, int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int val : arr) {
            hs.add(val);
        }
        return hs.size();
    }
}
