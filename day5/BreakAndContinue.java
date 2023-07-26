package day5;

public class BreakAndContinue {
    public static void main(String[] args) {

        // break -> terminates the loop and exits from it
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        // continue -> skips the currently running iteration and continues from next iteration
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
