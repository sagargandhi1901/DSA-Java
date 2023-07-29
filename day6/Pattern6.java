package day6;

/*
      Homework question for hackerrank

      For n = 5    ->       1
                          2 3 2
                        3 4 5 4 3
                          2 3 2
                            1
 */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowCount = 1;
        int numberOfElementsInRow = 1;
        int numberOfSpacesInRow = n / 2;
        int value = 1;

        while (rowCount <= n) {
            // printing spaces
            int countOfSpacesInRow = 1;
            while (countOfSpacesInRow <= numberOfSpacesInRow) {
                System.out.print("  ");
                countOfSpacesInRow++;
            }

            // printing numbers
            int countOfElementsInRow = 1;
            int temp = value;
            while (countOfElementsInRow <= numberOfElementsInRow) {
                System.out.print(temp + " ");
                if (countOfElementsInRow < (numberOfElementsInRow / 2) + 1) {
                    temp++;
                } else {
                    temp--;
                }
                countOfElementsInRow++;
            }

            if (rowCount <= n / 2) {
                numberOfElementsInRow += 2;
                numberOfSpacesInRow--;
                value++;
            } else {
                numberOfElementsInRow -= 2;
                numberOfSpacesInRow++;
                value--;
            }
            System.out.println();
            rowCount++;
        }
    }
}
