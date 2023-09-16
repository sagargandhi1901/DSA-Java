package day13;

import java.util.Scanner;

public class SetKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int value = 1 << k;
        int answer = n | value;
        System.out.println(answer);
    }

}
