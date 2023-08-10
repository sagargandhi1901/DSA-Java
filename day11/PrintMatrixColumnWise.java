package day11;

import java.util.Scanner;

public class PrintMatrixColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printMatrixColumnWise(arr, r, c);
    }

    public static void printMatrixColumnWise(int[][] arr, int r, int c) {
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
