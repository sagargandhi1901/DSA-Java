package day12.assignment;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        return str.equals(reverseString(str));
    }

    public static String reverseString(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(ch);
    }
}
