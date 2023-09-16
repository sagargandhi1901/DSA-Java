package day16;

import java.util.Scanner;

public class CountOfAAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count1 = firstCount(str, 0);
        int count2 = secondCount(str, 0);

        System.out.println(count1);
        System.out.println(count2);
    }

    public static int firstCount(String str, int index) {
        if (index >= str.length() - 2) {
            return 0;
        }
        int temp = firstCount(str, index + 1);
        if (str.charAt(index) == 'a' && str.charAt(index + 1) == 'a' && str.charAt(index + 2) == 'a') {
            return temp + 1;
        } else {
            return temp;
        }
    }

    public static int secondCount(String str, int index) {
        if (index >= str.length() - 2) {
            return 0;
        }
        if (str.charAt(index) == 'a' && str.charAt(index + 1) == 'a' && str.charAt(index + 2) == 'a') {
            int temp = secondCount(str, index + 3);
            return temp + 1;
        } else {
            int temp = secondCount(str, index + 1);
            return temp;
        }
    }
}
