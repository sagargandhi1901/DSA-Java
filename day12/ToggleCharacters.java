package day12;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        toggle(ch);
        for (char c : ch) {
            System.out.print(c);
        }
    }

    public static void toggle(char[] chArr) {
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] >= 65 && chArr[i] <= 90) {
                chArr[i] = (char) (chArr[i] + 32);
            } else {
                chArr[i] = (char) (chArr[i] - 32);
            }
        }
    }
}
