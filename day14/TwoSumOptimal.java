package day14;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(findPairSum(arr, n, k));
    }

    public static boolean findPairSum(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : arr) {
            if (hm.containsKey(val)) {
                int temp = hm.get(val);
                hm.put(val, temp + 1);
            } else {
                hm.put(val, 1);
            }
        }

        for (int val : arr) {
            int a = val;
            int b = k - a;

            if (a != b && hm.containsKey(b)) {
                return true;
            } else if (a == b && hm.containsKey(b) && hm.get(b) > 1) {
                return true;
            }
        }

        return false;
    }
}
