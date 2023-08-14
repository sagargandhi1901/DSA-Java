package day12;

import java.util.Scanner;

public class CharAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));

        char ch = sc.nextLine().charAt(0);
        System.out.println(ch);

        int x = 'A';
        System.out.println(x);

        char ch2 = 66;
        System.out.println(ch2);

        char ch3 = 'A';
        ch3 = (char) (ch3 + 3);
        System.out.println(ch3);
    }
}
