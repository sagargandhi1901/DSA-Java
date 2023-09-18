package day18;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = findSquareRoot(n);
        System.out.println(result);
    }

    public static int findSquareRoot(int n) {
        int start = 1;
        int end = n;
        int ans = Integer.MIN_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
