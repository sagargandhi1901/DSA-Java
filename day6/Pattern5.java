package day6;

import java.util.Scanner;

/*
      For n = 7    ->   * * * *   * * * *
                        * * *       * * *
                        * *           * *
                        *               *
                        * *           * *
                        * * *       * * *
                        * * * *   * * * *

 */

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowCount = 1;
        int numberOfStarsInRow = (n / 2) + 1;
        int numberOfSpacesInRow = 1;

        while (rowCount <= n) {

            // printing stars
            int countOfStarsInRow = 1;
            while (countOfStarsInRow <= numberOfStarsInRow) {
                System.out.print("* ");
                countOfStarsInRow++;
            }

            // printing spaces
            int countOfSpacesInRow = 1;
            while (countOfSpacesInRow <= numberOfSpacesInRow) {
                System.out.print("  ");
                countOfSpacesInRow++;
            }

            // printing stars again
            int countOfStarsInRow2 = 1;
            while (countOfStarsInRow2 <= numberOfStarsInRow) {
                System.out.print("* ");
                countOfStarsInRow2++;
            }

            if (rowCount <= n / 2) {
                numberOfStarsInRow--;
                numberOfSpacesInRow+=2;
            } else {
                numberOfStarsInRow++;
                numberOfSpacesInRow-=2;
            }
            System.out.println();
            rowCount++;
        }
    }
}
