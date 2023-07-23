package day3;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("Eligible for driving licence");
//        }

        int age = sc.nextInt();
        if (age >= 18 && age < 100) {
            System.out.println("Eligible for driving licence");
        } else {
            System.out.println("Enter valid age");
        }
        System.out.println("**********Program ended**********");
    }
}