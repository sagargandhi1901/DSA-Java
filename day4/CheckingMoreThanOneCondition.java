package day4;

import java.util.Scanner;

public class CheckingMoreThanOneCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean condition1 = sc.nextBoolean();
        boolean condition2 = sc.nextBoolean();

        // using AND operator
        if (condition1 && condition2) {
            System.out.println("If");
        } else {
            System.out.println("Else");
        }

        // using OR operator
        if (condition1 || condition2) {
            System.out.println("If");
        } else {
            System.out.println("Else");
        }

        // if-else-if
        if (condition1 || condition2 ) {
            System.out.println("If");
        } else if (condition1 && condition2){
            System.out.println("Else if");
        } else {
            System.out.println("Else");
        }
    }
}
