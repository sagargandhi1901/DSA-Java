package day9;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Printing array elements before initializing values : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing array elements after initializing values : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
