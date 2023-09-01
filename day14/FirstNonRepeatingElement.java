package day14;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findFirstNonRepeatingElement(arr, n));
    }

    public static int findFirstNonRepeatingElement(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
