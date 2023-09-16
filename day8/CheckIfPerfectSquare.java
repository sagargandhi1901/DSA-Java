package day8;

import java.util.Scanner;

public class CheckIfPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkIfNumberIsPerfectSquare(n));
    }

    public static boolean checkIfNumberIsPerfectSquare(int n) {
        int ans = 1;
        for (int i = 1; i * i <= n; i++) {
            ans = i;
        }
        return ans * ans == n;
    }
}
