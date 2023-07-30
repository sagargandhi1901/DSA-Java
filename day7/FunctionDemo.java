package day7;

import java.util.Scanner;

public class FunctionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int additionResult = doAddition(num1, num2);
        System.out.println("Addition : " + additionResult);

        int subtractionResult = doSubtraction(num1, num2);
        System.out.println("Subtraction : " + subtractionResult);
    }

    public static int doAddition(int num1, int num2) {
        return (num1 + num2);
    }

    public static int doSubtraction(int num1, int num2) {
        return (num1 - num2);
    }
}
