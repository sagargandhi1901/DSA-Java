package day6;

import java.util.Scanner;

/*
      For n = 5    ->       *
                          * * *
                        * * * * *
                          * * *
                            *
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowCount = 1;
        int numberOfStarsInRow = 1;
        int numberOfSpacesInRow = n / 2;

        while (rowCount <= n) {
            // printing spaces
            int countOfSpacesInRow = 1;
            while (countOfSpacesInRow <= numberOfSpacesInRow) {
                System.out.print("  ");
                countOfSpacesInRow++;
            }

            // printing stars
            int countOfStarsInRow = 1;
            while (countOfStarsInRow <= numberOfStarsInRow) {
                System.out.print("* ");
                countOfStarsInRow++;
            }

            if (rowCount <= n / 2) {
                numberOfStarsInRow += 2;
                numberOfSpacesInRow--;
            } else {
                numberOfStarsInRow -= 2;
                numberOfSpacesInRow++;
            }
            System.out.println();
            rowCount++;
        }
    }
}
