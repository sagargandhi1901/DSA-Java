package day16;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();

        boolean result = isPalindrome(ch, 0, ch.length - 1);
        System.out.println(result);
    }

    public static boolean isPalindrome(char[] ch, int start, int end) {
        if (start == end || start > end) {
            return true;
        }
        if (ch[start] == ch[end]) {
            boolean temp = isPalindrome(ch, ++start, --end);
            return temp;
        }
        return false;
    }
}
