package day2;

import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Entered number is : " + n);

        String str = sc.next();
        System.out.println("Entered string is : " + str);
    }
}
