package day12.assignment;

import java.util.Scanner;

public class InsertDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(insertDiff(str));
    }

    public static String insertDiff(String inputStr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputStr.length() - 1; i++) {
            result.append(inputStr.charAt(i));
            int asciiDiff = inputStr.charAt(i + 1) - inputStr.charAt(i);
            result.append(asciiDiff);
        }

        result.append(inputStr.charAt(inputStr.length() - 1));
        return result.toString();
    }
}
