package day6;

import java.util.Scanner;

/*
      For n = 4    ->   1
                        2 3
                        4 5 6
                        7 8 9 10
 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowCount = 1;
        int numberOfElementsInRow = 1;
        int value = 1;

        while (rowCount <= n) {

            int countOfElementsInRow = 1;
            while (countOfElementsInRow <= numberOfElementsInRow) {
                System.out.print(value + "\t");
                value++;
                countOfElementsInRow++;
            }

            System.out.println();
            rowCount++;
            numberOfElementsInRow++;
        }
    }
}
