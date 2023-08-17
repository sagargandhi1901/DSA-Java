package day13;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        System.out.println(45 << 1);
        System.out.println(45 << 2);

        System.out.println(24 >> 1);
        System.out.println(24 >> 2);
    }
}
