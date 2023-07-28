package day6;

import java.util.Scanner;

/*
      For n = 5    ->   * * * * *
                        * * * * *
                        * * * * *
                        * * * * *
                        * * * * *
 */

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowCount = 1;
        int numberOfStarsInRow = n;

        while (rowCount <= n) {

            int countOfStarsInRow = 1;
            while (countOfStarsInRow <= numberOfStarsInRow) {
                System.out.print("* ");
                countOfStarsInRow++;
            }

            System.out.println();
            rowCount++;
        }
    }
}
