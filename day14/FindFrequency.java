package day14;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }

        printFrequency(arr, queries, n, m);
    }

    // First approach : O(n*m)
//    public static void printFrequency(int[] arr, int[] queries, int n, int m) {
//        for (int i = 0; i < m; i++) {
//            int val = queries[i];
//            int count = 0;
//
//            for (int j = 0; j < n; j++) {
//                if (arr[j] == val) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }

    // Second approach : O(n + m)
    public static void printFrequency(int[] arr, int[] queries, int n, int m) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < m; i++) {
            if (hm.containsKey(queries[i])) {
                System.out.println(hm.get(queries[i]));
            } else {
                System.out.println(0);
            }
        }
    }
}
