package day14;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] xArr = new int[n];
        for (int i = 0; i < n; i++) {
            xArr[i] = sc.nextInt();
        }

        int[] yArr = new int[n];
        for (int i = 0; i < n; i++) {
            yArr[i] = sc.nextInt();
        }

        System.out.println(findDistinctPoints(xArr, yArr, n));
    }

    public static int findDistinctPoints(int[] xArr, int[] yArr, int n) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(xArr[i] + "," + yArr[i]);
        }
        return hs.size();
    }
}
